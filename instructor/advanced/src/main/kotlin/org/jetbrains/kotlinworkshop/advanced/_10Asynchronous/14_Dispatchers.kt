package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.*


fun main(args: Array<String>) {

    val jobs = arrayListOf<Job>()

    jobs += launch(Unconfined) {
        println("Unconfined: ${threadName()}")
    }

    jobs += launch(CommonPool) {
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