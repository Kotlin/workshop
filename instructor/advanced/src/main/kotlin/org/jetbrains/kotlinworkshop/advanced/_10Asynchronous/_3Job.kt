package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*


fun main(args: Array<String>) = runBlocking {

    val job = launch(CommonPool) {
        delay(1000L)
        println("World!")
    }
    println("Hello, ")
    job.join()
}

