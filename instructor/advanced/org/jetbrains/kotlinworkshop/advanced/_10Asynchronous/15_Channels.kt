package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
    val channel = Channel<Int>()

    GlobalScope.launch() {
        for (x in 1..5) {
            channel.send(x * x)
        }
    }
    repeat(5) {
        println(channel.receive())
    }
}

