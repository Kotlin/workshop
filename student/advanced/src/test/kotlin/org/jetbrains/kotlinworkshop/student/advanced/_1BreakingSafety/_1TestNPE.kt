package org.jetbrains.kotlinworkshop.student.advanced._1BreakingSafety


import org.junit.jupiter.api.Test
import kotlin.test.*

class TestNPE {
    @Test
    fun testThrowingNPE() {
        assertFailsWith<NullPointerException> {
            mightThrowNPE()
        }
    }
}