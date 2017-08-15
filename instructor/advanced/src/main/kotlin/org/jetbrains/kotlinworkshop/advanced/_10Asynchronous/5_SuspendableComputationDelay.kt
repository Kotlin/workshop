package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*


fun main(args: Array<String>) = runBlocking {
    println("Starting here")
    launch(CommonPool) {
        suspendableProcess()
    }
    println("Ending here")
    delay(4000)
}
