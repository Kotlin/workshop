package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
    val job = launch {
        longRunning()
    }
    delay(4000)
    job.cancel()
}

suspend fun longRunning() {
    delay(10000)
    println("longRunning called")
}
