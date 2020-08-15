package com.github.gabrielnadoncanada.timemanager.services

import com.intellij.openapi.project.Project
import com.github.gabrielnadoncanada.timemanager.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
