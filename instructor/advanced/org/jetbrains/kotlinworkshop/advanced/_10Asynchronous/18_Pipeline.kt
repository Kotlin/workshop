package org.jetbrains.kotlinworkshop.advanced._18_Pipeline

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking


fun producerPipeline() = GlobalScope.produce {
    var x = 1
    while (true) send(x++)
}

fun consumerPipeline(numbers: ReceiveChannel<Int>) = GlobalScope.produce<Int> {
    for (x in numbers) {
        send(x * x)
    }
}

fun main() = runBlocking<Unit> {
    val numbers = producerPipeline()
    val squares = consumerPipeline(numbers)
    for (i in 1..5) {
        println(squares.receive())
    }
    squares.cancel()
}