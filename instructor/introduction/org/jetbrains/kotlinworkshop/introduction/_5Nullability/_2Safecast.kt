package org.jetbrains.kotlinworkshop.introduction._5Nullability

class A(val value: Int)

fun foo(a: Any?) = (a as? A)?.value

fun main() {
    println(foo(A(42)))   // 42
    println(foo(42))      // null
    println(foo(null))    // null
}