package org.jetbrains.kotlinworkshop.introduction._3Classes

// Adding data makes the compiler generate useful methods
// such as equals, hashCode, toString.
data class Person(
        val name: String,
        val age: Int)

fun main(args: Array<String>) {
    val person1 = Person("Alice", 21)
    val person2 = Person("Alice", 21)
    println(person1)
    println(person1 == person2)
}