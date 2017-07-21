package org.jetbrains.kotlinworkshop.advanced._4Returns

fun main(args: Array<String>) {

}

fun containingFunction3() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) return@forEach
    }
    println("Hello")
}

fun containingFunction4() {
    val numbers = 1..100
    numbers.forEach myLabel@ {
        if (it % 5 == 0) return@myLabel
    }
}

fun containingFunction5() {
    val numbers = 1..100
    numbers.forEach(fun(element) {
        if (element % 5 == 0) return
    })
    println("Hello")
}




