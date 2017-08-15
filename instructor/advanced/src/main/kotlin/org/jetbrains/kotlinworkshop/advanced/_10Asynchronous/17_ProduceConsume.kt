package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.*


fun main(args: Array<String>) = runBlocking {
    val squares = produceSquares()
    squares.consumeEach {
        println(it)
    }
}


fun produceSquares() = produce<Int>(CommonPool) {
    for (x in 1..5) {
        send (x * x)
    }
}