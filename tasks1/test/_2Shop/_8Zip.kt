package _2Shop

import _2Shop.data.customers
import _2Shop.data.shop
import org.junit.Assert
import org.junit.Test

class _8Zip {
    @Test
    fun testZipNameAndCustomer() {
        Assert.assertEquals(customers.toList(), shop.zipNameAndCustomer())
    }
}