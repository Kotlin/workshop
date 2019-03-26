package org.jetbrains.kotlinworkshop.introduction._2ControlStructures

fun whileLoop() {
    fun condition() = true

    while (condition()) {
        /*...​*/
    }

    do {
        /*...​*/
    } while (condition())
}


fun forLoop() {
    val list = listOf(1, 2, 3)
    for (element in list) {
        print(element)
    }

    for (i in 1..9) { // including 9
        print(i)
    }

    // excluding 10 (the same as 1..9)
    for (i in 1 until 10) {
        print(i)
    }

    for (i in 9 downTo 1 step 2) {
        print(i)
    }
}

fun main() {
    forLoop()
}