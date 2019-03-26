package org.jetbrains.kotlinworkshop.quizzes._4Nullability

fun main() {
    val s = "abc"
    println(s as Int?)
    println(s as? Int)
}