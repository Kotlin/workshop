package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.*


sealed class CounterMessage
object IncCounter: CounterMessage()
class GetCounter(val response: CompletableDeferred<Int>): CounterMessage()

fun counterActor() = actor<CounterMessage>(CommonPool) {
    var counter = 0
    for (msg in channel) {
        when (msg) {
            is IncCounter -> counter++
            is GetCounter -> msg.response.complete(counter)
        }
    }
}

fun main(args: Array<String>) = runBlocking<Unit> {
    val counter = counterActor()
    massiveRun(CommonPool) {
        counter.send(IncCounter)
    }
    val response = CompletableDeferred<Int>()
    counter.send(GetCounter(response))
    println("Counter = ${response.await()}")
    counter.close()
}