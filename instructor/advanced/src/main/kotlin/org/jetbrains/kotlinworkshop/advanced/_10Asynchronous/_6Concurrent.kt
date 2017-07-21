package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*
import kotlin.system.*


suspend fun firstFunction1(): Int {
    delay(1000L)
    return 13
}

suspend fun secondFunction1(): Int {
    delay(1000L)
    return 29
}

fun main(args: Array<String>) = runBlocking {
    val time = measureTimeMillis {
        val first = async(CommonPool) { firstFunction1() }
        val second = async(CommonPool) { secondFunction1() }
        println("${first.await() + second.await()}")
    }
    println("Completed in $time")
}
