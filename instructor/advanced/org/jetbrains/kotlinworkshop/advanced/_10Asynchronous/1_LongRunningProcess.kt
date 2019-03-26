package org.jetbrains.kotlinworkshop.advanced._10Asynchronous


fun main() {


    println("Starting here")
    longRunningProcess()
    println("Ending here")

}

fun longRunningProcess() {
    Thread.sleep(5000)
    println("in process")
}
