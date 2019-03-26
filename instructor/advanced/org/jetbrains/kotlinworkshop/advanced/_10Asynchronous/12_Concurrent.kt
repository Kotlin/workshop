package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() = runBlocking {

    val time = measureTimeMillis {
        val one = async(Dispatchers.Default) { function1() }
        val two = async(Dispatchers.Default) { function2() }
        println("Result is ${one.await() + two.await()}")
    }
    println("Total time: $time")

}


