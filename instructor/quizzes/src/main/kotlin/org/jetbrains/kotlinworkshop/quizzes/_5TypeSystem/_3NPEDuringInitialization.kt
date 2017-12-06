package org.jetbrains.kotlinworkshop.quizzes._5TypeSystem

open class A(open val value: String) {
    init {

    }
}

class B(override val value: String) : A(value)

fun main(args: Array<String>) {
    // Complete the declaration of the class A
    // so that NPE is thrown during the creation of its subclass B instance
    B("a")
}