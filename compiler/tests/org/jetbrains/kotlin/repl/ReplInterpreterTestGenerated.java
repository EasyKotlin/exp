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

package org.jetbrains.kotlin.repl;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.InnerTestClasses;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/repl")
@TestDataPath("$PROJECT_ROOT")
@InnerTestClasses({ReplInterpreterTestGenerated.Classes.class, ReplInterpreterTestGenerated.Multiline.class, ReplInterpreterTestGenerated.Objects.class, ReplInterpreterTestGenerated.PrimitiveTypes.class, ReplInterpreterTestGenerated.Reflection.class})
@RunWith(JUnit3RunnerWithInners.class)
public class ReplInterpreterTestGenerated extends AbstractReplInterpreterTest {
    public void testAllFilesPresentInRepl() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl"), Pattern.compile("^(.+)\\.repl$"), true);
    }

    @TestMetadata("analyzeErrors.repl")
    public void testAnalyzeErrors() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/analyzeErrors.repl");
        doTest(fileName);
    }

    @TestMetadata("constants.repl")
    public void testConstants() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/constants.repl");
        doTest(fileName);
    }

    @TestMetadata("empty.repl")
    public void testEmpty() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/empty.repl");
        doTest(fileName);
    }

    @TestMetadata("evaluationErrors.repl")
    public void testEvaluationErrors() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/evaluationErrors.repl");
        doTest(fileName);
    }

    @TestMetadata("function.repl")
    public void testFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/function.repl");
        doTest(fileName);
    }

    @TestMetadata("functionOverloadResolution.repl")
    public void testFunctionOverloadResolution() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/functionOverloadResolution.repl");
        doTest(fileName);
    }

    @TestMetadata("functionOverloadResolutionAnyBeatsString.repl")
    public void testFunctionOverloadResolutionAnyBeatsString() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/functionOverloadResolutionAnyBeatsString.repl");
        doTest(fileName);
    }

    @TestMetadata("functionReferencesPrev.repl")
    public void testFunctionReferencesPrev() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/functionReferencesPrev.repl");
        doTest(fileName);
    }

    @TestMetadata("imports.repl")
    public void testImports() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/imports.repl");
        doTest(fileName);
    }

    @TestMetadata("simple.repl")
    public void testSimple() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/simple.repl");
        doTest(fileName);
    }

    @TestMetadata("syntaxErrors.repl")
    public void testSyntaxErrors() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/syntaxErrors.repl");
        doTest(fileName);
    }

    @TestMetadata("twoClosures.repl")
    public void testTwoClosures() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/twoClosures.repl");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/repl/classes")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Classes extends AbstractReplInterpreterTest {
        public void testAllFilesPresentInClasses() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/classes"), Pattern.compile("^(.+)\\.repl$"), true);
        }

        @TestMetadata("classInheritance.repl")
        public void testClassInheritance() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/classes/classInheritance.repl");
            doTest(fileName);
        }

        @TestMetadata("classRedeclaration.repl")
        public void testClassRedeclaration() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/classes/classRedeclaration.repl");
            doTest(fileName);
        }

        @TestMetadata("emptyClass.repl")
        public void testEmptyClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/classes/emptyClass.repl");
            doTest(fileName);
        }

        @TestMetadata("emptyClassRedeclaration.repl")
        public void testEmptyClassRedeclaration() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/classes/emptyClassRedeclaration.repl");
            doTest(fileName);
        }

        @TestMetadata("enumEntrySubclass.repl")
        public void testEnumEntrySubclass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/classes/enumEntrySubclass.repl");
            doTest(fileName);
        }

        @TestMetadata("import.repl")
        public void testImport() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/classes/import.repl");
            doTest(fileName);
        }

        @TestMetadata("simpleClass.repl")
        public void testSimpleClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/classes/simpleClass.repl");
            doTest(fileName);
        }

        @TestMetadata("simpleEnum.repl")
        public void testSimpleEnum() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/classes/simpleEnum.repl");
            doTest(fileName);
        }

        @TestMetadata("simpleTrait.repl")
        public void testSimpleTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/classes/simpleTrait.repl");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/repl/multiline")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Multiline extends AbstractReplInterpreterTest {
        public void testAllFilesPresentInMultiline() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/multiline"), Pattern.compile("^(.+)\\.repl$"), true);
        }

        @TestMetadata("functionOnSeveralLines.repl")
        public void testFunctionOnSeveralLines() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/multiline/functionOnSeveralLines.repl");
            doTest(fileName);
        }

        @TestMetadata("multilineFunctionInvocation.repl")
        public void testMultilineFunctionInvocation() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/multiline/multilineFunctionInvocation.repl");
            doTest(fileName);
        }

        @TestMetadata("openParenthesisIncomplete.repl")
        public void testOpenParenthesisIncomplete() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/multiline/openParenthesisIncomplete.repl");
            doTest(fileName);
        }

        @TestMetadata("simpleFunctionBodyOnNextLine.repl")
        public void testSimpleFunctionBodyOnNextLine() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/multiline/simpleFunctionBodyOnNextLine.repl");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/repl/objects")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Objects extends AbstractReplInterpreterTest {
        public void testAllFilesPresentInObjects() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/objects"), Pattern.compile("^(.+)\\.repl$"), true);
        }

        @TestMetadata("emptyObject.repl")
        public void testEmptyObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/objects/emptyObject.repl");
            doTest(fileName);
        }

        @TestMetadata("localObject.repl")
        public void testLocalObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/objects/localObject.repl");
            doTest(fileName);
        }

        @TestMetadata("simpleObjectDeclaration.repl")
        public void testSimpleObjectDeclaration() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/objects/simpleObjectDeclaration.repl");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/repl/primitiveTypes")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class PrimitiveTypes extends AbstractReplInterpreterTest {
        public void testAllFilesPresentInPrimitiveTypes() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/primitiveTypes"), Pattern.compile("^(.+)\\.repl$"), true);
        }

        @TestMetadata("arrayOfBoxed.repl")
        public void testArrayOfBoxed() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/primitiveTypes/arrayOfBoxed.repl");
            doTest(fileName);
        }

        @TestMetadata("boxingOnPurpose.repl")
        public void testBoxingOnPurpose() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/primitiveTypes/boxingOnPurpose.repl");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/repl/reflection")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Reflection extends AbstractReplInterpreterTest {
        public void testAllFilesPresentInReflection() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/reflection"), Pattern.compile("^(.+)\\.repl$"), true);
        }

        @TestMetadata("propertyReference.repl")
        public void testPropertyReference() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/repl/reflection/propertyReference.repl");
            doTest(fileName);
        }
    }
}