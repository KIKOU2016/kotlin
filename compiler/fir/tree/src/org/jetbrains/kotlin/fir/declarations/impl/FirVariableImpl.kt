/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.declarations.impl

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.expressions.FirExpression
import org.jetbrains.kotlin.fir.expressions.FirVariable
import org.jetbrains.kotlin.fir.types.FirType
import org.jetbrains.kotlin.name.Name

class FirVariableImpl(
    session: FirSession,
    psiElement: PsiElement?,
    name: Name,
    override val returnType: FirType,
    override val isVar: Boolean,
    override val initializer: FirExpression?
) : FirAbstractNamedAnnotatedDeclaration(session, psiElement, name), FirVariable