package org.jetbrains.kotlinworkshop.student.single._1BreakingSafety


import org.jetbrains.kotlinworkshop.student.single._1BreakingSafety.*
import org.junit.jupiter.api.*
import kotlin.test.*

class TestNPE {
    @Test
    fun testThrowingNPE() {
        assertFailsWith<NullPointerException> {
            mightThrowNPE()
        }
    }
}