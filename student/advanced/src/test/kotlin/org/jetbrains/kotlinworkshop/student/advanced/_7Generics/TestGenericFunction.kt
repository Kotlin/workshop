package org.jetbrains.kotlinworkshop.student.advanced._7Generics


import _7Generics.partitionLettersAndOtherSymbols
import _7Generics.partitionWordsAndLines
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestGenericFunction {
    @Test fun testPartitionWordsAndLines() {
        val (words, lines) = listOf("a", "a b", "c", "d e").partitionWordsAndLines()
        assertEquals(listOf("a", "c"), words)
        assertEquals(listOf("a b", "d e"), lines)
    }

    @Test fun testPartitionLettersAndOtherSymbols() {
        val (letters, other) = setOf('a', '%', 'r', '}').partitionLettersAndOtherSymbols()
        assertEquals(setOf('a', 'r'), letters)
        assertEquals(setOf('%', '}'), other)
    }
}