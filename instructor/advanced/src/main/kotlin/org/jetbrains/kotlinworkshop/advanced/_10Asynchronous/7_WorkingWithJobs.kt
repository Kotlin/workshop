package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*


// Notice explicit Unit
fun main(args: Array<String>) = runBlocking<Unit> {
    val job = launch(CommonPool) {
        longRunning()
    }
    delay(4000)
    job.cancel()
}

suspend fun longRunning() {
    delay(10000)
    println("longRunning called")
}
