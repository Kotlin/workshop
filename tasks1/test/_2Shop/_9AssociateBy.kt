package _2Shop

import _2Shop.data.customers
import _2Shop.data.shop
import org.junit.Assert
import org.junit.Test

class _9AssociateBy {
    @Test
    fun testZipNameAndCustomer() {
        Assert.assertEquals(customers, shop.associateCustomersByName())
    }
}