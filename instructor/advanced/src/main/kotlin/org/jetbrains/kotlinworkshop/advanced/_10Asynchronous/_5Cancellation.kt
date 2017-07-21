package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*


fun main(args: Array<String>) = runBlocking<Unit> {

    val job = launch(CommonPool) {
        var i = 0
        while (i < 1000) {
            i++
            println(i)
            delay(300L)
        }
        repeat(1000, {
            println("Running $it")
            delay(300L)
        })
    }
    println("Outside of `repeat`")
    delay(1000L)
    job.cancel()
}


