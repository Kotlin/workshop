package org.jetbrains.kotlinworkshop.introduction._3Classes

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)

    StateLogger().state = true
}

class StateLogger {
    var state = false
        set(value) {
            println("state has changed")
            field = value
        }
}