package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*
import kotlin.system.*


fun main(args: Array<String>) = runBlocking<Unit> {

    val time = measureTimeMillis {
        val one = async(CommonPool, CoroutineStart.LAZY) { function1() }
        val two = async(CommonPool, CoroutineStart.LAZY) { function2() }
        println("Result is ${one.await() + two.await()}")
    }
    println("Total time: $time")

}


