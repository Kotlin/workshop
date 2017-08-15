package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*
import kotlin.system.*


fun main(args: Array<String>) = runBlocking<Unit> {

    val time = measureTimeMillis {
        val one = async(CommonPool) { function1() }
        val two = async(CommonPool) { function2() }
        println("Result is ${one.await() + two.await()}")
    }
    println("Total time: $time")

}


