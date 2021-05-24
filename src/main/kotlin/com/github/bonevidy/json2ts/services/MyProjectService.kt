package com.github.bonevidy.json2ts.services

import com.github.bonevidy.json2ts.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
