package com.github.jacksonliuyn.testplugin.services

import com.intellij.openapi.project.Project
import com.github.jacksonliuyn.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
