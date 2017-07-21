package org.jetbrains.kotlinworkshop.introduction._9Functional


fun fibonnaciRecursive(n: Long): Long {
    return when (n) {
        0L, 1L -> n
        else -> fibonnaciRecursive(n - 1) + fibonnaciRecursive(n - 2)
    }
}

fun fibonacciIterative(n: Long): Long {
    var a = 0L
    var b = 1L
    for (i in 0..n - 1) {
        val temp = a
        a = b
        b = temp + a
    }
    return a
}


val cache = hashMapOf<Long, Long>(0L to 0L, 1L to 1L)

fun fibonacciMemoised(n: Long): Long {
    return if (cache.containsKey(n)) {
        cache.getValue(n)
    } else {
        val result = fibonacciMemoised(n - 1) + fibonacciMemoised(n - 2)
        cache[n] = result
        result
    }
}

fun main(args: Array<String>) {
    println(fibonacciMemoised(560))
}