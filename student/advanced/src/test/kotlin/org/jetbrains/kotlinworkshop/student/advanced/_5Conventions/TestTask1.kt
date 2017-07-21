package org.jetbrains.kotlinworkshop.student.advanced._5Conventions

import org.junit.jupiter.api.*
import kotlin.test.*

class TestTask1 {
    @Test fun testDateComparison() {
        assertTrue(task1(MyDate(2014, 1, 1), MyDate(2014, 1, 2)))
    }

    @Test fun testBefore() {
        val first = MyDate(2014, 5, 10)
        val second = MyDate(2014, 7, 11)
        assertTrue(first < second, "The date ${first.s} should be before ${second.s}")
    }

    @Test fun testAfter() {
        val first = MyDate(2014, 10, 20)
        val second = MyDate(2014, 7, 11)
        assertTrue(first > second, "The date ${first.s} should be after ${second.s}")
    }

    operator fun MyDate.compareTo(other: MyDate): Int = TODO("This function shouldn't be called if MyDate implements 'Comparable<MyDate>'")
}