package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.experimental.*
import kotlin.concurrent.*


fun threads() {
    val jobs = 1..100000
    jobs.forEach {

        thread {
            Thread.sleep(1000L)
            print(".")
        }
    }
}


















fun coroutines() = runBlocking {
    val jobs = List(100000) {
        launch(CommonPool) {
            delay(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() }
}



fun main(args: Array<String>) {

    coroutines()
    // threads()

}