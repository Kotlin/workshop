package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.*
import kotlin.system.*


val counterContext = newSingleThreadContext("CounterContext")
var counter = 0

fun main(args: Array<String>) = runBlocking<Unit> {
    // Switch to counterContext for faster execution
    massiveRun(CommonPool) {
        run(counterContext) { // remove run when switching to counterContext
            counter++
        }
    }
    println("Counter = $counter")
}

suspend fun massiveRun(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            launch(context) {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${ n * k} actions in $time ms")

}