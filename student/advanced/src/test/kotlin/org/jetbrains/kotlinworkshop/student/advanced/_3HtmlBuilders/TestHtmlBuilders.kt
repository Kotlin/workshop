package org.jetbrains.kotlinworkshop.student.advanced._3HtmlBuilders

import org.junit.jupiter.api.*
import kotlin.test.*

class TestHtmlBuilders {
    @Test fun productTableIsFilled() {
        val result = renderProductTable()
        println(renderProductTable())
        assertTrue(result.contains("cactus"), "Product table should contain corresponding data")
    }

    @Test fun productTableIsColored() {
        val result = renderProductTable()
        assertTrue(result.contains("bgcolor"), "Product table should be colored")
    }

    @Test fun allColorsAreUsed() {
        val result = renderProductTable()
        val colors = listOf("#b9c9fe", "#dce4ff", "#eff2ff")
        assertTrue(colors.all { result.contains(it) }, "Product table should be colored in chess order")
    }
}
