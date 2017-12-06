package org.jetbrains.kotlinworkshop.quizzes._5TypeSystem

fun mightThrowNPE() {
    println(JavaClass().value.length)
}

fun main(args: Array<String>) {
    mightThrowNPE() // throws NPE, because getValue() returns null
}