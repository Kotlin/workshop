package org.jetbrains.kotlinworkshop.quizzes._2Extensions

open class Parent
class Child: Parent()

fun Parent.foo() = "parent"

fun Child.foo() = "child"

fun main(args: Array<String>) {
    val parent: Parent = Child()
    println(parent.foo())
}