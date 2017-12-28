package logo

import react.RBuilder
import react.dom.div
import react.dom.img
import react.dom.jsStyle
import webpack.require

@JsModule("logo/react.svg")
external val reactLogo: dynamic

@JsModule("logo/kotlin.svg")
external val kotlinLogo: dynamic

fun RBuilder.logo(height: Int = 100) {
    require("logo/Logo.css")

    div("Logo") {
        attrs.jsStyle.height = height

        img(alt = "React logo.logo", src = reactLogo, classes = "Logo-react") {}
        img(alt = "Kotlin logo.logo", src = kotlinLogo, classes = "Logo-kotlin") {}
    }
}