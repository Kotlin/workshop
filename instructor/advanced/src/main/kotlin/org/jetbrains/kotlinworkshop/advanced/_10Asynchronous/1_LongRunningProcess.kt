package com.hadihariri.kotlin.async


fun main(args: Array<String>) {


    println("Starting here")
    longRunningProcess()
    println("Ending here")

}

fun longRunningProcess() {
    Thread.sleep(5000)
    println("in process")
}
