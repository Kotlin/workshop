package org.jetbrains.kotlinworkshop.student.advanced._4CreatingDsl


import org.junit.jupiter.api.*
import kotlin.test.*

class TestBreakfastMenuCreation {
    @Test
    fun testMenuIsCreated() {
        val menu = createCustomMenu()
        val message = "Menu items should be added to the menu"
        assertEquals(5, menu.items.size, message)
        assertEquals("French Toast", menu.items[3].name, message)
        assertEquals(900, menu.items[2].calories, message)
        assertEquals(6.95, menu.items[4].price, message)
    }
}