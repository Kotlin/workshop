package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.single._2Shop.*
import org.junit.jupiter.api.*
import kotlin.test.*

class _9AssociateBy {
    @Test
    fun testAssociateCustomersByName() {
        assertEquals(customers, shop.associateCustomersByName())
    }
}