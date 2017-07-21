package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.introduction._2Shop.zipNameAndCustomer
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class _8Zip {
    @Test
    fun testZipNameAndCustomer() {
        assertEquals(customers.toList(), shop.zipNameAndCustomer())
    }
}