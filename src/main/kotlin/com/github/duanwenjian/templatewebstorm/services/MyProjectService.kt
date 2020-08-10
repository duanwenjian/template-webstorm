package com.github.duanwenjian.templatewebstorm.services

import com.intellij.openapi.project.Project
import com.github.duanwenjian.templatewebstorm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
