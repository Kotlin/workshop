package _2Shop

import _2Shop.data.shop
import _2Shop.data.sortedCustomers
import org.junit.Assert.assertEquals
import org.junit.Test

class _6Sort {
    @Test fun testGetCustomersSortedByNumberOfOrders() {
        assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}
