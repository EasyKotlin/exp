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
import kotlin.platform.platformStatic

public object ClassInitializerTranslator {
    platformStatic
    public fun generateInitializeMethod(
            declaration: JetClassOrObject, 
            context: TranslationContext, 
            delegationTranslator: DelegationTranslator
    ): JsFunction {
        //TODO: it's inconsistent that we have scope for class and function for constructor, currently have problems implementing better way
        val classDescriptor = getClassDescriptor(context.bindingContext(), declaration)
        val primaryConstructor = classDescriptor.getUnsubstitutedPrimaryConstructor()

        val initializerStatements = SmartList<JsStatement>()

        val initFun: JsFunction
        val newContext: TranslationContext
        if (primaryConstructor != null) {
            initFun = context.getFunctionObject(primaryConstructor)
            
            newContext = context.contextWithScope(initFun)

            initFun.getBody().getStatements().addAll(setDefaultValueForArguments(primaryConstructor, newContext))

            //NOTE: while we translate constructor parameters we also add property initializer statements
            // for properties declared as constructor parameters
            initFun.getParameters().addAll(translatePrimaryConstructorParameters(initializerStatements, context, declaration))

            mayBeAddCallToSuperMethod(initializerStatements, declaration, initFun, newContext)
        }
        else {
            initFun = JsFunction(context.scope(), JsBlock(), "fake constructor for " + classDescriptor.getName().asString())
            newContext = context.contextWithScope(initFun)
        }

        delegationTranslator.addInitCode(initializerStatements)
        InitializerVisitor(initializerStatements).traverseContainer(declaration, newContext)

        val statements = initFun.getBody().getStatements()

        for (statement in initializerStatements) {
            if (statement is JsBlock) {
                statements.addAll(statement.getStatements())
            }
            else {
                statements.add(statement)
            }
        }

        return initFun
    }

    platformStatic
    public fun generateEnumEntryInstanceCreation(declaration: JetEnumEntry, enumClassType: JetType, context: TranslationContext): JsExpression {
        val superCall = getSuperCall(declaration, context)

        if (superCall == null) {
            val classDescriptor = getClassDescriptorForType(enumClassType)
            val reference = context.getQualifiedReference(classDescriptor)
            return JsNew(reference)
        }

        return CallTranslator.translate(context, superCall)
    }

    private fun mayBeAddCallToSuperMethod(initializerStatements: MutableList<JsStatement>, declaration: JetClassOrObject, initializer: JsFunction, context: TranslationContext) {
        if (declaration.hasModifier(JetTokens.ENUM_KEYWORD)) {
            addCallToSuperMethod(initializerStatements, emptyList<JsExpression>(), initializer, context)
            return
        }
        if (hasAncestorClass(context.bindingContext(), declaration)) {
            val superCall = getSuperCall(declaration, context) ?: return

            if (declaration is JetEnumEntry) {
                val expression = CallTranslator.translate(context, superCall, null)
                val fixedInvocation = expression.toInvocationWith(JsLiteral.THIS)
                initializerStatements.add(0, fixedInvocation.makeStmt())
            }
            else {
                val arguments = CallArgumentTranslator.translate(superCall, null, context).translateArguments
                addCallToSuperMethod(initializerStatements, arguments, initializer, context)
            }
        }
    }

    private fun addCallToSuperMethod(initializerStatements: MutableList<JsStatement>, arguments: List<JsExpression>, initializer: JsFunction, context: TranslationContext) {
        val ref = context.scope().declareName(Namer.CALLEE_NAME)
        initializer.setName(ref)
        val call = JsInvocation(Namer.getFunctionCallRef(Namer.superMethodNameRef(ref)))
        call.getArguments().add(JsLiteral.THIS)
        call.getArguments().addAll(arguments)
        initializerStatements.add(0, call.makeStmt())
    }

    private fun getSuperCall(declaration: JetClassOrObject, context: TranslationContext): ResolvedCall<FunctionDescriptor>? {
        for (specifier in declaration.getDelegationSpecifiers()) {
            if (specifier is JetDelegatorToSuperCall) {
                @suppress("UNCHECKED_CAST")
                return specifier.getResolvedCallWithAssert(context.bindingContext()) as ResolvedCall<FunctionDescriptor>
            }
        }
        return null
    }

    private fun translatePrimaryConstructorParameters(initializerStatements: MutableList<JsStatement>, context: TranslationContext, declaration: JetClassOrObject): List<JsParameter> {
        val parameterList = getPrimaryConstructorParameters(declaration)
        val result = ArrayList<JsParameter>()
        for (jetParameter in parameterList) {
            result.add(translateParameter(initializerStatements, jetParameter, context))
        }
        return result
    }

    private fun translateParameter(initializerStatements: MutableList<JsStatement>, jetParameter: JetParameter, context: TranslationContext): JsParameter {
        val parameterDescriptor = getDescriptorForElement(context.bindingContext(), jetParameter)
        val parameterName = context.getNameForDescriptor(parameterDescriptor)
        val jsParameter = JsParameter(parameterName)
        mayBeAddInitializerStatementForProperty(initializerStatements, jsParameter, jetParameter, context)
        return jsParameter
    }

    private fun mayBeAddInitializerStatementForProperty(initializerStatements: MutableList<JsStatement>, jsParameter: JsParameter, jetParameter: JetParameter, context: TranslationContext) {
        val propertyDescriptor = getPropertyDescriptorForConstructorParameter(context.bindingContext(), jetParameter) ?: return
        val initialValueForProperty = jsParameter.getName().makeRef()
        initializerStatements.add(InitializerUtils.generateInitializerForProperty(context, propertyDescriptor, initialValueForProperty))
    }
}
