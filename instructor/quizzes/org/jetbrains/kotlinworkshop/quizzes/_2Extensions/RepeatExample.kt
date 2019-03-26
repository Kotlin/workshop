package org.jetbrains.kotlinworkshop.quizzes._2Extensions

fun String.repeat(n: Int) = buildString {
    for (i in 1..n) {
        append(this@repeat)
    }
}

fun main() {
    println("ab".repeat(3)) // ababab
}