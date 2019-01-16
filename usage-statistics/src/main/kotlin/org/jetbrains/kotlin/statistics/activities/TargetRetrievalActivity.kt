/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.statistics.activities

class TargetRetrievalActivity : StartupActivity {

    override fun runActivity(project: Project) {
        project.allModules().forEach {
            val platform = it.platform.toString()
            when (it.getBuildSystemType()) {
                BuildSystemType.JPS ->
                    KotlinStatisticsTrigger.trigger(
                            KotlinJPSTargetTrigger::class.java,
                            platform
                    )
                BuildSystemType.Maven ->
                    KotlinStatisticsTrigger.trigger(
                            KotlinMavenTargetTrigger::class.java,
                            platform
                    )

            }
        }
    }
}