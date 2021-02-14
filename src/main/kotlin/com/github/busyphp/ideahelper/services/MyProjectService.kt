package com.github.busyphp.ideahelper.services

import com.github.busyphp.ideahelper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
