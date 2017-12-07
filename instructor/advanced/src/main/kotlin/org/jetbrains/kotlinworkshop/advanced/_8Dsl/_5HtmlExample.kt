package org.jetbrains.kotlinworkshop.advanced._8Dsl

@DslMarker
annotation class HtmlDsl

open class Tag(val name: String) {
    private val children = mutableListOf<Tag>()

    protected fun <T: Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)
    }

    override fun toString() =
            "<$name>${children.joinToString("")}</$name>"
}

fun table(init: TABLE.() -> Unit): TABLE {
    val table = TABLE()
    table.init()
    return table
}

@HtmlDsl
class TABLE : Tag("table") {
    fun tr(init: TR.() -> Unit) = doInit(TR(), init)
}

@HtmlDsl
class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) = doInit(TD(), init)
}

@HtmlDsl
class TD : Tag("td")

fun createTable(): TABLE {
    return table {
        tr {
            for (i in 1..2) {
                td {
                }
            }
        }
    }
}

fun main(args: Array<String>) {
    println(createTable())
    // <table><tr><td></td><td></td></tr></table>
}