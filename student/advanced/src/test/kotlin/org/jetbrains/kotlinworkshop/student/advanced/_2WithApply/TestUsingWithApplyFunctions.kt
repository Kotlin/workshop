package org.jetbrains.kotlinworkshop.student.advanced._2WithApply

import org.junit.jupiter.api.*
import kotlin.test.*


class TestUsingWithApplyFunctions {
    @Test
    fun testUsingWith() {
        val menuItem = initializeMenuItem1()
        val message = "Menu item should initialized (using 'with' function)"
        assertEquals("Belgian Waffles", menuItem.name, message)
        assertEquals(5.95, menuItem.price, message)
        assertEquals(650, menuItem.calories, message)
    }

    @Test
    fun testUsingApply() {
        val menuItem = initializeMenuItem2()
        val message = "Menu item should initialized (using 'apply' function)"
        assertEquals("Belgian Waffles", menuItem.name, message)
        assertEquals(5.95, menuItem.price, message)
        assertEquals(650, menuItem.calories, message)
    }
}