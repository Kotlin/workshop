package org.jetbrains.kotlinworkshop.advanced._18_Pipeline

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking


fun CoroutineScope.producerPipeline() = produce {
    var x = 1
    while (true) send(x++)
}

fun CoroutineScope.consumerPipeline(numbers: ReceiveChannel<Int>) = produce {
    for (x in numbers) {
        send(x * x)
    }
}

fun main() = runBlocking {
    val numbers = producerPipeline()
    val squares = consumerPipeline(numbers)
    for (i in 1..5) {
        println(squares.receive())
    }
    squares.cancel()
}