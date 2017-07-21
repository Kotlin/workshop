package org.jtebrains.kotlinworkshop.student.introduction._3TaxiPark


import org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark.*
import org.junit.jupiter.api.*
import kotlin.test.*

class _6TestParetoPrinciple {
    @Test
    fun testParetoPrincipleSucceeds() {
        // 20% of the drivers: 1
        // the profit of the first driver: 500
        // the profit of all: 620
        // 500 >= 0.8 * 620 = 496
        val park = taxiPark(1..8, 1..8, order(1, 1, duration = 250, distance = 250.0),
                order(2, 2), order(3, 3), order(4, 4), order(5, 5), order(6, 6), order(7, 7))
        assertTrue(park.checkParetoPrinciple())
    }

    @Test
    fun testRandomDriverIsTheBest() {
        // the same as before, the best driver is now #5
        val park = taxiPark(1..8, 1..8, order(5, 1, duration = 250, distance = 250.0),
                order(2, 2), order(3, 3), order(4, 4), order(6, 6), order(7, 7), order(8, 8))
        assertTrue(park.checkParetoPrinciple())
    }

    @Test
    fun testSeveralBestDrivers() {
        // 20% of the drivers: 1, 10
        // the profit of 1, 10: 800
        // the profit of all: 940
        // 800 >= 0.8 * 940 = 752
        val park = taxiPark(1..10, 1..10,
                order(1, 1, duration = 200, distance = 200.0),
                order(10, 10, duration = 200, distance = 200.0),
                order(2, 2), order(3, 3), order(4, 4), order(5, 5), order(6, 6), order(7, 7), order(8, 8))
        assertTrue(park.checkParetoPrinciple())
    }

    @Test
    fun testNotEnoughDrivers() {
        // the first driver doesn't make up 20%
        val park = taxiPark(1..4, 1..4, order(1, 1, duration = 110, distance = 110.0),
                order(2, 2), order(3, 3), order(4, 4))
        assertFalse(park.checkParetoPrinciple())
    }

    @Test
    fun testParetoPrincipleFails() {
        // 20% of the drivers: 1
        // the profit of the first driver: 220
        // the profit of all: 300
        // 220 < 0.8 * 300 = 240
        val park = taxiPark(1..5, 1..5, order(1, 1, duration = 110, distance = 110.0),
                order(2, 2), order(3, 3), order(4, 4), order(5, 5))
        assertFalse(park.checkParetoPrinciple())
    }

    @Test
    fun testExactly80Percent() {
        // 20% of the drivers: 1
        // the profit of the first driver: 240
        // the profit of all: 300
        // 240 >= 0.8 * 300 = 240

        // tip: Use BigDecimal instead of double for comparison
        val park = taxiPark(1..5, 1..5, order(1, 1, duration = 120, distance = 120.0),
                order(2, 2), order(3, 3), order(4, 4))
        assertFalse(park.checkParetoPrinciple())
    }
}