package _2Shop

import _2Shop.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class _4FlatMap {
    @Test fun testGetOrderedProductsSet() {
        assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    @Test fun testGetAllOrderedProducts() {
        assertEquals(orderedProducts, shop.allOrderedProducts)
    }
}
