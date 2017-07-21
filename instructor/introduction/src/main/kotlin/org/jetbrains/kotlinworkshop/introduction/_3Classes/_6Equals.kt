package org.jetbrains.kotlinworkshop.introduction._3Classes

fun main(args: Array<String>) {
    val set1 = setOf(1, 2, 3)
    val set2 = setOf(1, 2, 3)

    // checks reference equality
    println(set1 === set2)

    // calls equals
    println(set1 == set2)
}