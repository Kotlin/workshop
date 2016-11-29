package _2Shop

import _2Shop.data.customers
import _2Shop.data.reka
import _2Shop.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class _11Partition {
    @Test fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        assertEquals(setOf(customers[reka]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    }
}
