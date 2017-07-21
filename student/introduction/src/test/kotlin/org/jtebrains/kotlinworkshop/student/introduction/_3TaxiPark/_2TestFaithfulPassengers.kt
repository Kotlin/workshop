package org.jtebrains.kotlinworkshop.student.introduction._3TaxiPark


import org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark.*
import org.junit.jupiter.api.*
import kotlin.test.*

class _2TestFaithfulPassengers {
    @Test
    fun testFaithfulPassengersMoreThanMin() {
        val park = taxiPark(1..1, 1..2,
                order(1, 1), order(1, 2), order(1, 2))
        assertEquals(passengers(2), park.findFaithfulPassengers(1))
    }

    @Test
    fun testNoFaithfulPassengers() {
        val park = taxiPark(1..1, 1..2,
                order(1, 1), order(1, 2))
        assertTrue(park.findFaithfulPassengers(1).isEmpty())
    }

    @Test
    fun testFaithfulPassenger() {
        val park = taxiPark(1..2, 1..3,
                order(1, 2), order(1, 2), order(2, 2), order(2, 2))
        assertEquals(passengers(2), park.findFaithfulPassengers(3))
    }

    @Test
    fun testFaithfulPassengers() {
        val park = taxiPark(1..3, 1..5,
                order(1, 1), order(2, 1), order(1, 4), order(3, 4), order(1, 5), order(2, 5), order(2, 2))
        assertEquals(passengers(1, 4, 5), park.findFaithfulPassengers(1))
    }
}
