package org.jetbrains.kotlinworkshop.advanced._10Asynchronous

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main()  {
    println("Starting here")
    GlobalScope.launch() {
        suspendableProcess()
    }
    println("Ending here")
    Thread.sleep(4000)
}
