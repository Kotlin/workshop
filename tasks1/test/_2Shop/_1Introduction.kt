package _2Shop

import _2Shop.data.customers
import _2Shop.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class _1Introduction {
    @Test fun testSetOfCustomers() {
        assertEquals(customers.values.toSet(), shop.getSetOfCustomers())
    }
}
