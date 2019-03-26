package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.*


fun main() = runBlocking {

    val jobs = arrayListOf<Job>()

    jobs += launch(Dispatchers.Unconfined) {
        println("Unconfined: ${threadName()}")
    }

    jobs += launch() {
        isActive
        println("CommonPool: ${threadName()}")
    }

    jobs += launch(newSingleThreadContext("CustomThread")) {
        println("CustomThread: ${threadName()}")
    }

    /*jobs += launch(coroutineContext) {
        println("CustomThread: ${threadName()}")
    }*/

}




fun threadName(): String = Thread.currentThread().name