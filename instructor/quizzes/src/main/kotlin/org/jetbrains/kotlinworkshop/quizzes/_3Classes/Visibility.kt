package org.jetbrains.kotlinworkshop.quizzes._3Classes

fun main(args: Array<String>) {
    foo()
//    C().bar()
}

private fun foo() {}

class C {
    private fun bar() {}

    inner class A {
        fun foo() = bar()
    }
}