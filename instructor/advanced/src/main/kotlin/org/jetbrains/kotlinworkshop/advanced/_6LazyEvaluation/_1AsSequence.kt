package org.jetbrains.kotlinworkshop.advanced._6LazyEvaluation


fun main(args: Array<String>) {


    val numbers = 1..100_000_000

    numbers.filter { it % 5 == 0 }.take(30)


    numbers.asSequence().filter { it % 5 == 0 }.take(30)


}