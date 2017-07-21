package org.jetbrains.kotlinworkshop.student.advanced._1BreakingSafety

/* optional task */

open class A(open val value: String) {

}

class B(override val value: String) : A(value)

fun main(args: Array<String>) {
    // Complete the declaration of the class A
    // so that NPE is thrown during the creation of its subclass B instance
    B("a")
}