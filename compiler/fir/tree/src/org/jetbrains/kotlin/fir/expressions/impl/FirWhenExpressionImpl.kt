/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.expressions.impl

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.fir.FirAbstractElement
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.expressions.FirExpression
import org.jetbrains.kotlin.fir.expressions.FirVariable
import org.jetbrains.kotlin.fir.expressions.FirWhenBranch
import org.jetbrains.kotlin.fir.expressions.FirWhenExpression

class FirWhenExpressionImpl(
    session: FirSession,
    psiElement: PsiElement?,
    override val subject: FirExpression? = null,
    override val subjectVariable: FirVariable? = null
) : FirAbstractElement(session, psiElement), FirWhenExpression {
    override val branches = mutableListOf<FirWhenBranch>()
}