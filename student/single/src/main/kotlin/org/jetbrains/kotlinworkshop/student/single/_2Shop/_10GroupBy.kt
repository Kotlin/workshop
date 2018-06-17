package org.jetbrains.kotlinworkshop.student.single._2Shop

fun main(args: Array<String>) {

    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }

    result == mapOf(1 to listOf("a", "b"), 2 to listOf("ba", "ad"), 3 to listOf("ccc"))

    println(result)  // {1=[a, b], 2=[ba, ad], 3=[ccc]}
}

// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> {
    TODO()
}
