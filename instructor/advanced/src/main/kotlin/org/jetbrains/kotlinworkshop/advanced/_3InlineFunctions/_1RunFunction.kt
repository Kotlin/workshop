package org.jetbrains.kotlinworkshop.advanced._3InlineFunctions

class Board(val width: Int) {
    val indices1: List<Pair<Int, Int>>

    init {
        val result = mutableListOf<Pair<Int, Int>>()
        for (i in 1..width) {
            for (j in 1..width) {
                result += i to j
            }
        }
        indices1 = result
    }

    val indices = run {
        val result = mutableListOf<Pair<Int, Int>>()
        for (i in 1..width) {
            for (j in 1..width) {
                result += i to j
            }
        }
        result.toList()
    }
}

inline fun <R> run(block: () -> R): R = block()

fun main(args: Array<String>) {
    val table = Board(3)
    for ((i, j) in table.indices) {
        print("($i, $j) ")
    }
}