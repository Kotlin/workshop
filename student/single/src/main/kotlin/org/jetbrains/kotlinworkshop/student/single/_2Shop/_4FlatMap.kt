package org.jetbrains.kotlinworkshop.student.single._2Shop

fun main(args: Array<String>) {
    val result = listOf("abc", "12").flatMap(String::toList)

    result == listOf('a', 'b', 'c', '1', '2')

    println(result)   // [a, b, c, 1, 2]
}

// Return all products that were ordered by customer
val Customer.orderedProducts: Set<Product> get() {
    TODO()
}

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product> get() {
    TODO()
}
