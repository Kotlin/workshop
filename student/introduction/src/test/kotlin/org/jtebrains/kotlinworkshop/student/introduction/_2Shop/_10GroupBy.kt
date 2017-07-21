package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.introduction._2Shop.groupCustomersByCity
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class _10GroupBy {
    @Test fun testGroupCustomersByCity() {
        assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
