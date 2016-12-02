package _3HtmlBuilders

import org.junit.Assert.assertTrue
import org.junit.Test

class TestHtmlBuilders {
    @Test fun productTableIsFilled() {
        val result = renderProductTable()
        println(renderProductTable())
        assertTrue("Product table should contain corresponding data", result.contains("cactus"))
    }

    @Test fun productTableIsColored() {
        val result = renderProductTable()
        assertTrue("Product table should be colored", result.contains("bgcolor"))
    }

    @Test fun allColorsAreUsed() {
        val result = renderProductTable()
        val colors = listOf("#b9c9fe", "#dce4ff", "#eff2ff")
        assertTrue("Product table should be colored in chess order", colors.all { result.contains(it) })
    }
}
