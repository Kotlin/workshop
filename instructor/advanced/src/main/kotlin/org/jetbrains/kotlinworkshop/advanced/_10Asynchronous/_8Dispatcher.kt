package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*


fun main(args: Array<String>) = runBlocking {

    val job1 = launch(CommonPool) {
        println("${Thread.currentThread().name}")
    }
    val job2 = launch(Unconfined) {
        println("${Thread.currentThread().name}")
    }
    val job3 = launch(context) {
        println("${Thread.currentThread().name}")
    }


}