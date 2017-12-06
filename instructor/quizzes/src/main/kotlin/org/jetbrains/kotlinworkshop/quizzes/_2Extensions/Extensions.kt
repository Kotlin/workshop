package org.jetbrains.kotlinworkshop.quizzes._2Extensions

// Try 'convert receiver to parameter'
// and 'convert parameter to receiver' actions
fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

fun main(args: Array<String>) {
    val sum = listOf(1, 2, 3).sum()
    println(sum)
}