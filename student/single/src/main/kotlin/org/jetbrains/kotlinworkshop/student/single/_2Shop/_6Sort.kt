package org.jetbrains.kotlinworkshop.student.single._2Shop

fun main(args: Array<String>) {
    val result = listOf("a", "bbb", "cc").sortedBy { it.length }

    println(result)  // [a, cc, bbb]
}

// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> {
    TODO()
}
