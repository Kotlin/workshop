package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread


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
        GlobalScope.launch() {
            delay(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() }
}



fun main() {

    coroutines()
    // threads()

}