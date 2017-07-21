package org.jetbrains.kotlinworkshop.advanced._4Returns


fun main(args: Array<String>) {
    containingFunction()

}

// non-local returns
fun containingFunction() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) return
    }
    println("Hello")
}

inline fun <T> Iterable<T>.myForEach(f: (T) -> Unit) {
    for (element in this) f(element)
}

fun containingFunction2() {
    val numbers = 1..100
    numbers.myForEach {
        if (it % 5 == 0) return
    }
    println("Hello")
}


