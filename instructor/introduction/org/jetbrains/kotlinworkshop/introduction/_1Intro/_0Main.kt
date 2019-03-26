package org.jetbrains.kotlinworkshop.introduction._1Intro

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")

    // ${}
}
