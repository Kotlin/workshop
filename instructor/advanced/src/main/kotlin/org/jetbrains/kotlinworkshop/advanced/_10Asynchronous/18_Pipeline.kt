package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.*


fun producerPipeline() = produce(CommonPool) {
    var x = 1
    while (true) send(x++)
}

fun consumerPipeline(numbers: ReceiveChannel<Int>) = produce<Int>(CommonPool) {
    for (x in numbers) {
        send(x * x)
    }
}

fun main(args: Array<String>) = runBlocking<Unit> {
    val numbers = producerPipeline()
    val squares = consumerPipeline(numbers)
    for (i in 1..5) {
        println(squares.receive())
    }
    squares.cancel()
}