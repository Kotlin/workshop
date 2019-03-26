package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {


    println("Starting here")
    launch {
        suspendableProcess()
    }
    println("Ending here")

}

suspend fun suspendableProcess() {
    Thread.sleep(2000)
    println("in process")
}
