package org.jetbrains.kotlinworkshop.quizzes._5TypeSystem

import org.jetbrains.kotlinworkshop.quizzes._5TypeSystem.JavaClass.dangerousJavaMethod

fun mightContainNull(): List<Int> {
    val list: List<Int> = arrayListOf(1, 2, 3)
    // change the implementation of the `dangerousJavaMethod`
    // so that it add `null` values in the list
    dangerousJavaMethod(list)
    return list
}

fun main(args: Array<String>) {
    for (i in mightContainNull()) {  // NPE
        println(i)
    }
}