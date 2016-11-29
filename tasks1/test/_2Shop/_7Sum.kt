package _2Shop

import _2Shop.data.customers
import _2Shop.data.lucas
import _2Shop.data.nathan
import org.junit.Assert.assertEquals
import org.junit.Test

class _7Sum {
    @Test fun testGetTotalOrderPrice() {
        assertEquals(148.0, customers[nathan]!!.getTotalOrderPrice(), 0.001)
    }

    @Test fun testTotalPriceForRepeatedProducts() {
        assertEquals(586.0, customers[lucas]!!.getTotalOrderPrice(), 0.001)
    }
}
