/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.statistics

import com.intellij.internal.statistic.service.fus.collectors.ApplicationUsageTriggerCollector
import com.intellij.internal.statistic.service.fus.collectors.FUSApplicationUsageTrigger

open class KotlinStatisticsTrigger(private val groupIdSufix: String) : ApplicationUsageTriggerCollector() {
    override fun getGroupId() = "statistics.kotlin.$groupIdSufix"

    companion object {
        public fun trigger(clazz: Class<out KotlinStatisticsTrigger>, event: String) {
            FUSApplicationUsageTrigger.getInstance().trigger(clazz, event)
        }
    }
}

open class KotlinIdeStatisticsTrigger(groupIdSufix: String) : KotlinStatisticsTrigger("ide.$groupIdSufix")

open class KotlinGradlePluginStatisticsTrigger(groupIdSufix: String) : KotlinStatisticsTrigger("gradle.$groupIdSufix")
open class KotlinMavenPluginStatisticsTrigger(groupIdSufix: String) : KotlinStatisticsTrigger("maven.$groupIdSufix")
open class KotlinJPSPluginStatisticsTrigger(groupIdSufix: String) : KotlinStatisticsTrigger("jps.$groupIdSufix")

class KotlinVersionTrigger : KotlinGradlePluginStatisticsTrigger("kotlin_version")

class KotlinTargetTrigger : KotlinGradlePluginStatisticsTrigger("target")

class KotlinMavenTargetTrigger : KotlinMavenPluginStatisticsTrigger("target")

class KotlinJPSTargetTrigger : KotlinJPSPluginStatisticsTrigger("target")

class KotlinProjectLibraryUsageTrigger : KotlinGradlePluginStatisticsTrigger("library")

open class KotlinIdeActionTrigger(groupIdSufix: String? = null) : KotlinIdeStatisticsTrigger("action" + (if (groupIdSufix != null) ".$groupIdSufix" else ""))

class KotlinIdeUndoTrigger : KotlinIdeActionTrigger("undo")

class KotlinIdeQuickfixTrigger : KotlinIdeActionTrigger("quickfix")

class KotlinIdeRefactoringTrigger : KotlinIdeActionTrigger("refactoring")

class KotlinIdeIntentionTrigger : KotlinIdeActionTrigger("intention")

class KotlinIdeInspectionTrigger : KotlinIdeActionTrigger("inspection")

class KotlinIdeExceptionTrigger : KotlinIdeStatisticsTrigger("exception")

class KotlinIdeNewFileTemplateTrigger : KotlinIdeStatisticsTrigger("newFileTempl")