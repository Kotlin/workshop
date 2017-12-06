package org.jetbrains.kotlinworkshop.quizzes._4Nullability

fun main(args: Array<String>) {
    val s = "abc"
    println(s as Int?)
    println(s as? Int)
}