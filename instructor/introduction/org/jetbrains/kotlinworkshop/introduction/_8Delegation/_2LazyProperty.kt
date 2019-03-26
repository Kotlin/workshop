package org.jetbrains.kotlinworkshop.introduction._8Delegation

class LazyProperty {
    val lazy: Int by lazy {
        println("Calculate the value")
        42
    }
}

fun main() {
    println("--- creation ---")
    val property = LazyProperty()

    println("--- first access ---")
    property.lazy

    println("--- second access ---")
    property.lazy
}