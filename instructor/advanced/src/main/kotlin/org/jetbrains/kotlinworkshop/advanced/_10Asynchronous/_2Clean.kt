package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*


fun main(args: Array<String>) = runBlocking {

    launch(CommonPool) {
        delay(1000L)
        println("World!")
    }
    println("Hello, ")
    delay(2000L)

}

