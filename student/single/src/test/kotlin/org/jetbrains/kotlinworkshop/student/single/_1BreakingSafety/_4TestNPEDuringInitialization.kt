package org.jetbrains.kotlinworkshop.student.single._1BreakingSafety


import org.jetbrains.kotlinworkshop.student.single._1BreakingSafety.*
import org.junit.jupiter.api.*
import kotlin.test.*

class NPEDuringInitialization {
    @Test
    fun testSubclassInitialization() {
        assertFailsWith<NullPointerException> {
            B("abc")
        }
    }
}