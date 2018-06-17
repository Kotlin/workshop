package org.jetbrains.kotlinworkshop.student.single._2Shop

fun main(args: Array<String>) {
    val result = listOf(1, 2, 3, 4).fold(1, { partResult, element -> element * partResult })
    println(result) // 24 = 1 * 2 * 3 * 4
}

// The same as
fun whatFoldDoes(): Int {
    var result = 1
    listOf(1, 2, 3, 4).forEach { element -> result *= element }
    return result
}

// Return the set of products ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    return customers.fold(allOrderedProducts, {
        orderedByAll, customer ->
        TODO()
    })
}
