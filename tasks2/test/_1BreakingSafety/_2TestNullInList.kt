package _1BreakingSafety

import org.junit.Test
import kotlin.test.assertFailsWith

class NullInList {
    @Test
    fun testAddingNullToList() {
        val list: List<Int> = mightContainNull()
        assertFailsWith<NullPointerException> {
            for (i in list) {

            }
        }
    }
}