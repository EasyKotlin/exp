/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.js.translate.initializer

import com.google.dart.compiler.backend.js.ast.*
import com.intellij.util.SmartList
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.translate.callTranslator.CallTranslator
import org.jetbrains.kotlin.js.translate.context.Namer
import org.jetbrains.kotlin.js.translate.context.TranslationContext
import org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator
import org.jetbrains.kotlin.js.translate.general.AbstractTranslator
import org.jetbrains.kotlin.js.translate.reference.CallArgumentTranslator
import org.jetbrains.kotlin.js.translate.utils.BindingUtils.getClassDescriptor
import org.jetbrains.kotlin.js.translate.utils.BindingUtils.getDescriptorForElement
import org.jetbrains.kotlin.js.translate.utils.BindingUtils.getPropertyDescriptorForConstructorParameter
import org.jetbrains.kotlin.js.translate.utils.BindingUtils.hasAncestorClass
import org.jetbrains.kotlin.js.translate.utils.FunctionBodyTranslator.setDefaultValueForArguments
import org.jetbrains.kotlin.js.translate.utils.PsiUtils.getPrimaryConstructorParameters
import org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith
import org.jetbrains.kotlin.lexer.JetTokens
import org.jetbrains.kotlin.psi.JetClassOrObject
import org.jetbrains.kotlin.psi.JetDelegatorToSuperCall
import org.jetbrains.kotlin.psi.JetEnumEntry
import org.jetbrains.kotlin.psi.JetParameter
import org.jetbrains.kotlin.resolve.DescriptorUtils.getClassDescriptorForType
import org.jetbrains.kotlin.resolve.calls.callUtil.getResolvedCallWithAssert
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall
import org.jetbrains.kotlin.types.JetType
import java.util.ArrayList

public class ClassInitializerTranslator(private val classDeclaration: JetClassOrObject, context: TranslationContext) : AbstractTranslator(context.newDeclarationWithScope(getClassDescriptor(context.bindingContext(), classDeclaration), JsFunctionScope(context.scope(), "scope for primary/default constructor"))) {
    private val initializerStatements = SmartList<JsStatement>()

    public fun generateInitializeMethod(delegationTranslator: DelegationTranslator): JsFunction {
        //TODO: it's inconsistent that we have scope for class and function for constructor, currently have problems implementing better way
        val classDescriptor = getClassDescriptor(bindingContext(), classDeclaration)
        val primaryConstructor = classDescriptor.getUnsubstitutedPrimaryConstructor()

        val result: JsFunction
        if (primaryConstructor != null) {
            result = context().getFunctionObject(primaryConstructor)

            result.getBody().getStatements().addAll(setDefaultValueForArguments(primaryConstructor, context()))

            //NOTE: while we translate constructor parameters we also add property initializer statements
            // for properties declared as constructor parameters
            result.getParameters().addAll(translatePrimaryConstructorParameters())

            mayBeAddCallToSuperMethod(result)
        }
        else {
            result = JsFunction(context().scope(), JsBlock(), "fake constructor for " + classDescriptor.getName().asString())
        }

        delegationTranslator.addInitCode(initializerStatements)
        InitializerVisitor(initializerStatements).traverseContainer(classDeclaration, context())

        val statements = result.getBody().getStatements()

        for (statement in initializerStatements) {
            if (statement is JsBlock) {
                statements.addAll(statement.getStatements())
            }
            else {
                statements.add(statement)
            }
        }

        return result
    }

    public fun generateEnumEntryInstanceCreation(enumClassType: JetType): JsExpression {
        val superCall = getSuperCall()

        if (superCall == null) {
            val classDescriptor = getClassDescriptorForType(enumClassType)
            val reference = context().getQualifiedReference(classDescriptor)
            return JsNew(reference)
        }

        return CallTranslator.translate(context(), superCall)
    }

    private fun mayBeAddCallToSuperMethod(initializer: JsFunction) {
        if (classDeclaration.hasModifier(JetTokens.ENUM_KEYWORD)) {
            addCallToSuperMethod(emptyList<JsExpression>(), initializer)
            return
        }
        if (hasAncestorClass(bindingContext(), classDeclaration)) {
            val superCall = getSuperCall() ?: return

            if (classDeclaration is JetEnumEntry) {
                val expression = CallTranslator.translate(context(), superCall, null)
                val fixedInvocation = expression.toInvocationWith(JsLiteral.THIS)
                initializerStatements.add(0, fixedInvocation.makeStmt())
            }
            else {
                val arguments = CallArgumentTranslator.translate(superCall, null, context()).translateArguments
                addCallToSuperMethod(arguments, initializer)
            }
        }
    }

    private fun addCallToSuperMethod(arguments: List<JsExpression>, initializer: JsFunction) {
        val ref = context().scope().declareName(Namer.CALLEE_NAME)
        initializer.setName(ref)
        val call = JsInvocation(Namer.getFunctionCallRef(Namer.superMethodNameRef(ref)))
        call.getArguments().add(JsLiteral.THIS)
        call.getArguments().addAll(arguments)
        initializerStatements.add(0, call.makeStmt())
    }

    private fun getSuperCall(): ResolvedCall<FunctionDescriptor>? {
        for (specifier in classDeclaration.getDelegationSpecifiers()) {
            if (specifier is JetDelegatorToSuperCall) {
                //noinspection unchecked
                return specifier.getResolvedCallWithAssert(bindingContext()) as ResolvedCall<FunctionDescriptor>
            }
        }
        return null
    }

    fun translatePrimaryConstructorParameters(): List<JsParameter> {
        val parameterList = getPrimaryConstructorParameters(classDeclaration)
        val result = ArrayList<JsParameter>()
        for (jetParameter in parameterList) {
            result.add(translateParameter(jetParameter))
        }
        return result
    }

    private fun translateParameter(jetParameter: JetParameter): JsParameter {
        val parameterDescriptor = getDescriptorForElement(bindingContext(), jetParameter)
        val parameterName = context().getNameForDescriptor(parameterDescriptor)
        val jsParameter = JsParameter(parameterName)
        mayBeAddInitializerStatementForProperty(jsParameter, jetParameter)
        return jsParameter
    }

    private fun mayBeAddInitializerStatementForProperty(jsParameter: JsParameter, jetParameter: JetParameter) {
        val propertyDescriptor = getPropertyDescriptorForConstructorParameter(bindingContext(), jetParameter) ?: return
        val initialValueForProperty = jsParameter.getName().makeRef()
        addInitializerOrPropertyDefinition(initialValueForProperty, propertyDescriptor)
    }

    private fun addInitializerOrPropertyDefinition(initialValue: JsNameRef, propertyDescriptor: PropertyDescriptor) {
        initializerStatements.add(InitializerUtils.generateInitializerForProperty(context(), propertyDescriptor, initialValue))
    }
}
