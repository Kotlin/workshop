package org.jetbrains.kotlinworkshop.advanced._8Dsl


fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}


infix fun String.isTheSameAs(value: String) = this == value


fun main(args: Array<String>) {


    "Hello".isTheSameAs("Hello")

    "Hello" isTheSameAs "Hello"


    println("this is a sample string to Title Case it".toTitleCase())
}
