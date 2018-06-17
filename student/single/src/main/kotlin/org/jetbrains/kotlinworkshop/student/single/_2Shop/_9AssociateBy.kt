package org.jetbrains.kotlinworkshop.student.single._2Shop

fun main(args: Array<String>) {
    val list = listOf("a", "bc", "bd")

    val map: Map<Int, String> = list.associateBy(String::hashCode)

    println(map)   // {97=a, 3137=bc, 3138=bd}

    val noGrouping = list.associateBy(String::length)

    println(noGrouping) // {1=a, 2=bd}
}

// Find the correspondence between customers and their names (as a map)
fun Shop.associateCustomersByName(): Map<String, Customer> {
    TODO()
}