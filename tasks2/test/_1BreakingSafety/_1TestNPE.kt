package _1BreakingSafety

import org.junit.Test
import kotlin.test.assertFailsWith

class TestNPE {
    @Test
    fun testThrowingNPE() {
        assertFailsWith<NullPointerException> {
            mightThrowNPE()
        }
    }
}