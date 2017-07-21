package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.introduction._2Shop.associateCustomersByName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class _9AssociateBy {
    @Test
    fun testZipNameAndCustomer() {
        assertEquals(customers, shop.associateCustomersByName())
    }
}