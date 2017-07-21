package org.jtebrains.kotlinworkshop.student.introduction._2Shop


import org.jetbrains.kotlinworkshop.student.introduction._2Shop.*
import org.junit.jupiter.api.*
import kotlin.test.*

class _2FilterMap {
    @Test fun testCitiesCustomersAreFrom() {
        assertEquals(setOf(Canberra, Vancouver, Budapest, Ankara, Tokyo), shop.getCitiesCustomersAreFrom())
    }

    /**
     * Returns the list of the customers who live in the city 'city'
     */
    @Test fun testCustomersFromCity() {
        assertEquals(listOf(customers[lucas], customers[cooper]), shop.getCustomersFrom(Canberra))
    }
}
