/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/fir/resolve")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirResolveTestCaseGenerated extends AbstractFirResolveTestCase {
    public void testAllFilesPresentInResolve() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/fir/resolve"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/enum.kt");
        doTest(fileName);
    }

    @TestMetadata("F.kt")
    public void testF() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/F.kt");
        doTest(fileName);
    }

    @TestMetadata("genericFunctions.kt")
    public void testGenericFunctions() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/genericFunctions.kt");
        doTest(fileName);
    }

    @TestMetadata("NestedOfAliasedType.kt")
    public void testNestedOfAliasedType() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/NestedOfAliasedType.kt");
        doTest(fileName);
    }

    @TestMetadata("NestedSuperType.kt")
    public void testNestedSuperType() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/NestedSuperType.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleClass.kt")
    public void testSimpleClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/simpleClass.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleTypeAlias.kt")
    public void testSimpleTypeAlias() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/simpleTypeAlias.kt");
        doTest(fileName);
    }

    @TestMetadata("TwoDeclarationsInSameFile.kt")
    public void testTwoDeclarationsInSameFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/TwoDeclarationsInSameFile.kt");
        doTest(fileName);
    }

    @TestMetadata("typeAliasWithGeneric.kt")
    public void testTypeAliasWithGeneric() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/typeAliasWithGeneric.kt");
        doTest(fileName);
    }

    @TestMetadata("typeParameterVsNested.kt")
    public void testTypeParameterVsNested() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/typeParameterVsNested.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/fir/resolve/multifile")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Multifile extends AbstractFirResolveTestCase {
        public void testAllFilesPresentInMultifile() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/fir/resolve/multifile"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("NestedSuperType.kt")
        public void testNestedSuperType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/NestedSuperType.kt");
            doTest(fileName);
        }

        @TestMetadata("sealedStarImport.kt")
        public void testSealedStarImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/sealedStarImport.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleAliasedImport.kt")
        public void testSimpleAliasedImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/simpleAliasedImport.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleImport.kt")
        public void testSimpleImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/simpleImport.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleImportNested.kt")
        public void testSimpleImportNested() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/simpleImportNested.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleImportOuter.kt")
        public void testSimpleImportOuter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/simpleImportOuter.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleStarImport.kt")
        public void testSimpleStarImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/simpleStarImport.kt");
            doTest(fileName);
        }

        @TestMetadata("TypeAliasExpansion.kt")
        public void testTypeAliasExpansion() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/TypeAliasExpansion.kt");
            doTest(fileName);
        }
    }
}
