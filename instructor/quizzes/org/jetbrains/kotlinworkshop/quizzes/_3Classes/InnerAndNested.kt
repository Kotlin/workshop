package org.jetbrains.kotlinworkshop.quizzes._3Classes

class Outer {
    class A {
        fun foo() {
//            this@Outer
        }
    }
    inner class B {
        fun foo() {
            this@Outer
        }
    }
}