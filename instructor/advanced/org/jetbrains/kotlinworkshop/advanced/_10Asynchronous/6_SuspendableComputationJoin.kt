package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Starting here")
    val job = GlobalScope.launch() {
        suspendableProcess()
    }
    println("Ending here")
    job.join()
}

