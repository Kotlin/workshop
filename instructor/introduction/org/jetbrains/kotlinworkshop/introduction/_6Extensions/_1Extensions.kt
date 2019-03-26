//@file:JvmName("StringUtil")
package org.jetbrains.kotlinworkshop.introduction._6Extensions

fun String.lastChar() =
        this.get(this.length - 1)

// 'this' can be omitted
fun String.lastChar1() =
        get(length - 1)

fun test() {
    // visible in completion
    "abc".lastChar()
}

// Infix
infix fun String.isEqual(value: String) = this == value
