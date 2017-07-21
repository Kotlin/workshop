package org.jetbrains.kotlinworkshop.student.advanced._6LazyProperty

import org.junit.jupiter.api.*
import kotlin.test.*

class TestLazyProperty {
    @Test fun testLazy() {
        var initialized = false
        val lazyProperty = LazyProperty({ initialized = true; 42 })
        assertFalse(initialized, "Property shouldn't be initialized before access")
        val result: Int = lazyProperty.lazy
        assertTrue(initialized, "Property should be initialized after access")
        assertEquals(42, result)
    }

    @Test fun initializedOnce() {
        var initialized = 0
        val lazyProperty = LazyProperty({ initialized++; 42 })
        lazyProperty.lazy
        lazyProperty.lazy
        assertEquals(1, initialized, "Lazy property should be initialized once")

    }
}
