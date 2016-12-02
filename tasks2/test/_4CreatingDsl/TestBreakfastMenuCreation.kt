package _4CreatingDsl

import org.junit.Assert
import org.junit.Test

class TestBreakfastMenuCreation {
    @Test
    fun testMenuIsCreated() {
        val menu = createCustomMenu()
        val message = "Menu items should be added to the menu"
        Assert.assertEquals(message, 5, menu.items.size)
        Assert.assertEquals(message, "French Toast", menu.items[3].name)
        Assert.assertEquals(message, 900, menu.items[2].calories)
        Assert.assertEquals(message, 6.95, menu.items[4].price)
    }
}