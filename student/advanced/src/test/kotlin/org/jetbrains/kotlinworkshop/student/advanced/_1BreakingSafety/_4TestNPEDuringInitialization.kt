package org.jetbrains.kotlinworkshop.student.advanced._1BreakingSafety


import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

class NPEDuringInitialization {
    @Test
    fun testSubclassInitialization() {
        assertFailsWith<NullPointerException> {
            B("abc")
        }
    }
}