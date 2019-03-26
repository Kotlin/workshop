package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Starting here")
    launch() {
        suspendableProcess()
    }
    println("Ending here")
    Thread.sleep(4000)
}
