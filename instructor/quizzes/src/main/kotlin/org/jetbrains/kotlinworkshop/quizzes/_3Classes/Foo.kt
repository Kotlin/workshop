package org.jetbrains.kotlinworkshop.quizzes._3Classes

val foo1 = run {
    println("Calculating the answer... (1)")
    42
}

val foo2: Int
    get() {
        println("Calculating the answer... (2)")
        return 42
    }

fun main(args: Array<String>) {
    println("foo1:")
    println(foo1)
    println(foo1)
    println("foo2:")
    println(foo2)
    println(foo2)
}