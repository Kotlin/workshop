package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*


fun main(args: Array<String>) = runBlocking {
    println("Starting here")
    launch(CommonPool) {
        suspendableProcess()
    }
    println("Ending here")
    delay(4000)
}
