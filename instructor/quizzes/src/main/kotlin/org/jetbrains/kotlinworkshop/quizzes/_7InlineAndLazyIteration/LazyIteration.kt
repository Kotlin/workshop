package org.jetbrains.kotlinworkshop.quizzes._7InlineAndLazyIteration

// Eager and lazy evaluation

fun m(i: Int): Int {
    print("m$i ")
    return i * i
}

fun f(i: Int): Boolean {
    print("f$i ")
    return i % 2 == 0
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)

    list.map(::m).filter(::f)

    println()

    list.asSequence().map(::m).filter(::f).toList()

    println()

    list.asSequence().map(::m).filter(::f)

    println()

    list.asSequence().filter(::f).map(::m).toList()

}