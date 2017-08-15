package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*


fun main(args: Array<String>) {


    println("Starting here")
    launch(CommonPool) {

        suspendableProcess()
    }
    println("Ending here")
    while (true) {}
}
