package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() = runBlocking {

    val time = measureTimeMillis {
        val one = function1()
        val two = function2()
        println("Result is ${one + two}")
    }
    println("Total time: $time")

}


suspend fun function1(): Int {
    delay(1000)
    return 15
}

suspend fun function2(): Int {
    delay(1000)
    return 27
}