package org.jetbrains.kotlinworkshop.quizzes._7InlineAndLazyIteration

fun main(args: Array<String>) {
    collectionExample()
    println()
    sequenceExample()
}

fun collectionExample() {
    val list = listOf(1, 2, -3)
    val mapResult = list.map { it * it }
    println(mapResult)
    val filterResult = mapResult.filter { it % 2 == 1 }
    println(filterResult)
    val maxOddSquare = filterResult.max()
    println(maxOddSquare)
}

fun sequenceExample() {
    val sequence = listOf(1, 2, -3).asSequence()
    val mapResult = sequence.map { it * it }
    println(mapResult)
    val filterResult = mapResult.filter { it % 2 == 1 }
    println(filterResult)
    val maxOddSquare = filterResult.max()
    println(maxOddSquare)
}