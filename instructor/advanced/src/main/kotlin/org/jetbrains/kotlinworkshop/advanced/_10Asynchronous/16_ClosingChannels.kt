package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.*


fun main(args: Array<String>) = runBlocking {
    val channel = Channel<Int>()

    launch(CommonPool) {
        for (x in 1..7) {
            channel.send(x * x)
        }
        channel.close()
    }
    for (y in channel) {
        println(channel.receive())
    }
}

