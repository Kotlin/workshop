package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
    println("Starting here")
    launch {
        suspendableProcess()
    }
    println("Ending here")
    delay(4000)
}
