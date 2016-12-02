package _2WithApply

import org.junit.Assert
import org.junit.Test

class TestUsingWithApplyFunctions {
    @Test
    fun testUsingWith() {
        val menuItem = initializeMenuItem1()
        val message = "Menu item should initialized (using 'with' function)"
        Assert.assertEquals(message, "Belgian Waffles", menuItem.name)
        Assert.assertEquals(message, 5.95, menuItem.price)
        Assert.assertEquals(message, 650, menuItem.calories)
    }

    @Test
    fun testUsingApply() {
        val menuItem = initializeMenuItem2()
        val message = "Menu item should initialized (using 'apply' function)"
        Assert.assertEquals(message, "Belgian Waffles", menuItem.name)
        Assert.assertEquals(message, 5.95, menuItem.price)
        Assert.assertEquals(message, 650, menuItem.calories)
    }
}