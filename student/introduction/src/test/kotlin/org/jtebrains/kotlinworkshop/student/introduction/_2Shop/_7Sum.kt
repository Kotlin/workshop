package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.introduction._2Shop.getTotalOrderPrice
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class _7Sum {
    @Test fun testGetTotalOrderPrice() {
        assertEquals(148.0, customers[nathan]!!.getTotalOrderPrice())
    }

    @Test fun testTotalPriceForRepeatedProducts() {
        assertEquals(586.0, customers[lucas]!!.getTotalOrderPrice())
    }
}
