package org.jetbrains.kotlinworkshop.student.single._1BreakingSafety


import org.jetbrains.kotlinworkshop.student.single._1BreakingSafety.*
import org.junit.jupiter.api.*
import kotlin.test.*

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