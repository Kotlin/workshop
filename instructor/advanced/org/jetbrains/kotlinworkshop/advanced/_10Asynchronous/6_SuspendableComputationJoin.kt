package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Starting here")
    val job = launch() {
        suspendableProcess()
    }
    println("Ending here")
    job.join()
}

