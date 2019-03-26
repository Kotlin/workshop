package org.jetbrains.kotlinworkshop.introduction._2ControlStructures

fun iteratingOverCollection() {
    val list = listOf("a", "b")
    for (s in list) {
        println(s)
    }
}

fun iteratingOverMap() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    for ((key, value) in map) {
        println("$key = $value")
    }
}

fun iteratingOverCollectionWithIndex() {
    for ((index, element) in listOf("a", "b", "c").withIndex()) {
        println("$index $element")
    }
}

fun main() {
    iteratingOverCollection()
    iteratingOverMap()
    iteratingOverCollectionWithIndex()
}