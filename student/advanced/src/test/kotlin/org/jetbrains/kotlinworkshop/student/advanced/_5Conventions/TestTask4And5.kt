package org.jetbrains.kotlinworkshop.student.advanced._5Conventions

import org.junit.jupiter.api.*
import kotlin.test.*

class TestTask4And5 {
    @Test fun testAddTimeIntervals() {
        assertEquals(MyDate(2014, 5, 22), MyDate(1983, 5, 22).addTimeIntervals(TimeInterval.YEAR, 31))
        assertEquals(MyDate(1983, 5, 29), MyDate(1983, 5, 22).addTimeIntervals(TimeInterval.DAY, 7))
        assertEquals(MyDate(1983, 5, 29), MyDate(1983, 5, 22).addTimeIntervals(TimeInterval.WEEK, 1))
    }

    @Test fun testAddOneTimeInterval() {
        assertEquals(MyDate(2015, 5, 8), task4(MyDate(2014, 5, 1)))
    }

    @Test fun testOneMonth() {
        assertEquals(MyDate(2016, 0, 27), task5(MyDate(2014, 0, 1)))
    }

    @Test fun testMonthChange() {
        assertEquals(MyDate(2016, 1, 20), task5(MyDate(2014, 0, 25)))
    }
}
