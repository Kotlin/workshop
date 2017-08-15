package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*
import kotlin.system.*


fun main(args: Array<String>) = runBlocking<Unit> {

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