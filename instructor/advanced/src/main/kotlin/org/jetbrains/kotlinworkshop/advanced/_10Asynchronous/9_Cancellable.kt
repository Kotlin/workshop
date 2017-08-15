package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*


// Notice explicit Unit
fun main(args: Array<String>) = runBlocking {
    val job = launch(CommonPool) {
        var nextPrintTime = System.currentTimeMillis()
        var i = 0
        while (isActive) { // computation loop
            val currentTime = System.currentTimeMillis()
            if (currentTime >= nextPrintTime) {
                println("I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        } }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancel() // cancels the job
    delay(1300L) // delay a bit to see if it was cancelled....
    println("main: Now I can quit.")
}
