package com.hadihariri.kotlin.async


import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.runBlocking
import org.jetbrains.kotlinworkshop.advanced._10Asynchronous.massiveRun


sealed class CounterMessage
object IncCounter: CounterMessage()
class GetCounter(val response: CompletableDeferred<Int>): CounterMessage()

fun CoroutineScope.counterActor() = actor<CounterMessage> {
    var counter = 0
    for (msg in channel) {
        when (msg) {
            is IncCounter -> counter++
            is GetCounter -> msg.response.complete(counter)
        }
    }
}

fun main() = runBlocking<Unit> {
    val counter = counterActor()
    massiveRun(Dispatchers.Default) {
        counter.send(IncCounter)
    }
    val response = CompletableDeferred<Int>()
    counter.send(GetCounter(response))
    println("Counter = ${response.await()}")
    counter.close()
}