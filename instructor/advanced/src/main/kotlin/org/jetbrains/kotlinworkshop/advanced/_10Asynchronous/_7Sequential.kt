package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis


suspend fun firstFunction(): Int {
    delay(1000L)
    return 13
}

suspend fun secondFunction(): Int {
    delay(1000L)
    return 29
}

fun main(args: Array<String>) = runBlocking{
    val time = measureTimeMillis {
        val first = firstFunction1()
        val second = secondFunction1()
        println("${ first + second }")
    }
    println("Completed in $time")
}
