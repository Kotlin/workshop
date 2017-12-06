package org.jetbrains.kotlinworkshop.quizzes._1Intro

val foo1 = run {
    println("Calculating foo...")
    "foo"
}

fun foo2(): String {
    println("Calculating foo...")
    return "foo"
}

fun main(args: Array<String>) {
    println("======")
    println("First ${foo1}, second ${foo1}")
    println("------")
    println("First ${foo2()}, second ${foo2()}")
}