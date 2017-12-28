package index

import app.app
import org.w3c.dom.Element
import react.dom.*
import webpack.require
import kotlin.browser.*

fun main(args: Array<String>) {

    val rootNode = document.getElementById("root")

    rootNode?.let {
        startApplication(it)
    }
}

private fun startApplication(it: Element) {
    require("index/index.css")


    render(it) {
        app()
    }
}