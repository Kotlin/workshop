package org.jtebrains.kotlinworkshop.student.introduction._3TaxiPark

import org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark.*
import org.junit.jupiter.api.*
import kotlin.test.*

class _1TestFakeDrivers {
    @Test
    fun testFakeDrivers() {
        val park = taxiPark(driverIndexes = 1..3, passengerIndexes = 1..2,
                orders = listOf(order(driverIndex = 1, passengerIndexes = 1), order(1, 2)))
        assertEquals(drivers(2, 3).toSet(), park.findFakeDrivers())
    }

    @Test
    fun testNoFakeDrivers() {
        val park = taxiPark(1..2, 1..2, order(1, 1), order(2, 2))
        assertTrue(park.findFakeDrivers().isEmpty())
    }

}