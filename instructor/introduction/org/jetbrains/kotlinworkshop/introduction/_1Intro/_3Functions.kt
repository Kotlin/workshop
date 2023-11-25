package org.jetbrains.kotlinworkshop.introduction._1Intro

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int) = if (a > b) a else b

// default values for arguments
fun sum(a: Int, b: Int, c: Int = 0) = a + b + c


// vararg
fun printMany(vararg elements: Int) {
    for (element in elements) {
        println(element)
    }

    doSomething(*elements)

}

fun doSomething(vararg elements: Int) {
    for (element in elements) {
        println("Doing something $element")
    }
}

fun main() {
    sum(1, 2)
    sum(1, 2, 3)
    // named arguments
    sum(b = 2, a = 1)

    printMany(1, 2, 3, 4, 5)
}


