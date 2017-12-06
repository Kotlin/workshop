package org.jetbrains.kotlinworkshop.quizzes._4Nullability

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    println(s1.isNullOrEmpty() && s2.isNullOrEmpty())
}

fun String?.isNullOrEmpty(): Boolean = this == null || this.isEmpty()