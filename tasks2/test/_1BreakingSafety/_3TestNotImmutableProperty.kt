package _1BreakingSafety

import org.junit.Assert
import org.junit.Test

class TestNotImmutableProperty {
    @Test
    fun testDifferentValues() {
        val myClass = MyClass()
        Assert.assertNotEquals("Property should return different values",
                myClass.myProperty, myClass.myProperty)
    }
}