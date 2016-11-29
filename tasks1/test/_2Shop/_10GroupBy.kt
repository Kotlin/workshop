package _2Shop

import _2Shop.data.groupedByCities
import _2Shop.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class _10GroupBy {
    @Test fun testGroupCustomersByCity() {
        assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
