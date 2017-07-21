package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.introduction._2Shop.getCustomersSortedByNumberOfOrders
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class _6Sort {
    @Test fun testGetCustomersSortedByNumberOfOrders() {
        assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}
