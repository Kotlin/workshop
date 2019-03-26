package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
    val squares = produceSquares()
    squares.consumeEach {
        println(it)
    }
}


fun produceSquares() = GlobalScope.produce<Int> {
    for (x in 1..5) {
        send (x * x)
    }
}