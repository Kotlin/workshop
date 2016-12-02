package _1BreakingSafety

import org.junit.Test
import kotlin.test.assertFailsWith

class NPEDuringInitialization {
    @Test
    fun testSubclassInitialization() {
        assertFailsWith<NullPointerException> {
            B("abc")
        }
    }
}