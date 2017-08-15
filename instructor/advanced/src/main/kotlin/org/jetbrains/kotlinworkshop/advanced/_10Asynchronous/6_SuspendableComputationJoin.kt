package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*


fun main(args: Array<String>) = runBlocking {
    println("Starting here")
    val job = launch(CommonPool) {
        suspendableProcess()
    }
    println("Ending here")
    job.join()
}

