package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.*


fun main(args: Array<String>) = runBlocking {
    val channel = Channel<Int>()

    launch(CommonPool) {
        for (x in 1..5) {
            channel.send(x * x)
        }
    }
    repeat(5) {
        println(channel.receive())
    }
}

