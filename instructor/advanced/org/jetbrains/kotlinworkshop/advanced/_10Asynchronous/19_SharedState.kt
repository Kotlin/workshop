package org.jetbrains.kotlinworkshop.advanced._10Asynchronous


import kotlinx.coroutines.*
import java.util.concurrent.Executors
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis


val counterContext = Executors.newSingleThreadExecutor().asCoroutineDispatcher()

var counter = 0

fun main() = runBlocking {
    // Switch to counterContext for faster execution
    massiveRun(Dispatchers.Default) {
        withContext(counterContext) { // remove run when switching to counterContext
            counter++
        }
    }
    println("Counter = ${counter}")
}

suspend fun massiveRun(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch(context) {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${ n * k} actions in $time ms")

}