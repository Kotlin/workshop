package org.jtebrains.kotlinworkshop.student.introduction._3TaxiPark


import org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark.*
import org.junit.jupiter.api.*
import kotlin.test.*

class _5FrequentTripDuration {

    @Test
    fun testNoDurationInfo() {
        assertTrue(taxiPark(1..1, 1..1).findTheMostFrequentTripDurations().isEmpty())
    }

    @Test
    fun testSeveralFrequent() {
        val park = taxiPark(1..1, 1..1, order(1, 1, duration = 11), order(1, 1, duration = 12),
                order(1, 1, duration = 25), order(1, 1, duration = 26))
        assertEquals(listOf(10..19, 20..29), park.findTheMostFrequentTripDurations())
    }

    @Test
    fun testTheMostFrequentTripDuration() {
        val park = taxiPark(1..3, 1..5, order(1, 1, duration = 10), order(3, 4, duration = 30),
                order(1, 2, duration = 20), order(2, 3, duration = 30))
        assertEquals(listOf(30..39), park.findTheMostFrequentTripDurations())
    }
}