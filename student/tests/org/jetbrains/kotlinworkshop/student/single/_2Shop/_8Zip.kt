package org.jetbrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.single._2Shop.*
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class _8Zip {
    @Test
    fun testZipNameAndCustomer() {
        assertEquals(customers.toList(), shop.zipNameAndCustomer())
    }
}