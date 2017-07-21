package org.jetbrains.kotlinworkshop.introduction._9Functional


fun factorial(number: Int): Int {
    when (number) {
        0, 1 -> return 1
        else -> return number * factorial(number - 1)
    }
}


tailrec fun factorialTR(number: Int, accumulator: Int = 1): Int {
    when (number) {
        0 -> return accumulator
        else -> return factorialTR(number - 1, accumulator * number)
    }
}


fun main(args: Array<String>) {
    println(factorial(5))
    println(factorialTR(5))
}