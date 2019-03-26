package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.*


fun main() {

    val jobs = arrayListOf<Job>()

    jobs += GlobalScope.launch(Dispatchers.Unconfined) {
        println("Unconfined: ${threadName()}")
    }

    jobs += GlobalScope.launch() {
        isActive
        println("CommonPool: ${threadName()}")
    }

    jobs += GlobalScope.launch(newSingleThreadContext("CustomThread")) {
        println("CustomThread: ${threadName()}")
    }

    /*jobs += launch(coroutineContext) {
        println("CustomThread: ${threadName()}")
    }*/

}




fun threadName(): String = Thread.currentThread().name