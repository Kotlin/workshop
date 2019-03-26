package org.jetbrains.kotlinworkshop.student.introduction._2Shop


import org.jetbrains.kotlinworkshop.student.single._2Shop.*
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class _4FlatMap {
    @Test
    fun testGetOrderedProductsSet() {
        assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    @Test fun testGetAllOrderedProducts() {
        assertEquals(orderedProducts, shop.allOrderedProducts)
    }
}
