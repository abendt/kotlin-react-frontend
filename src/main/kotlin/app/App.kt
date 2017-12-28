package app

import logo.logo
import webpack.module
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import webpack.require

class App : RComponent<RProps, RState>() {

    var count: Int = 0

    init {
        val previousCount: Int? = module.hot?.let { hot ->
            hot.accept()

            hot.dispose { data ->
                // listen for disposal events
                data.counter = count
            }

            hot.data?.counter as Int?
        }

        previousCount?.let {
            count = it + 1
        }
    }

    override fun RBuilder.render() {
        require("app/App.css")

        div("App-header") {
            logo()

            h2 {
                +"Welcome to React with Kotlin"
            }
        }
        p("App-intro") {
            +"To get started, edit"
            code { +"app/App.kt" }
            +" and save to reload."
        }
        div {
            h3 {
                +"Hot Deployment #$count"
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}