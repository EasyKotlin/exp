/*
 * Copyright 2010-2014 JetBrains s.r.o.
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

package org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps

import org.jetbrains.kotlin.cfg.pseudocode.instructions.*
import org.jetbrains.jet.lang.psi.JetElement
import org.jetbrains.kotlin.cfg.Label

public class UnconditionalJumpInstruction(
        element: JetElement,
        targetLabel: Label,
        lexicalScope: LexicalScope
) : AbstractJumpInstruction(element, targetLabel, lexicalScope) {
    override fun accept(visitor: InstructionVisitor) {
        visitor.visitUnconditionalJump(this)
    }

    override fun <R> accept(visitor: InstructionVisitorWithResult<R>): R {
        return visitor.visitUnconditionalJump(this)
    }

    override fun toString(): String = "jmp(${targetLabel.getName()})"

    override fun createCopy(newLabel: Label, lexicalScope: LexicalScope): AbstractJumpInstruction =
            UnconditionalJumpInstruction(element, newLabel, lexicalScope)
}