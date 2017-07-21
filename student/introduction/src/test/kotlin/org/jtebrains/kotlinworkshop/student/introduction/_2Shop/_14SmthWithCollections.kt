package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.introduction._2Shop.*
import org.junit.jupiter.api.*
import kotlin.test.*

class _14SmthWithCollections {
    @Test fun testCollectionOfOneElement() {
        doTest(listOf("a"), listOf("a"))
    }

    @Test fun testEmptyCollection() {
        doTest(null, listOf())
    }

    @Test fun testSimpleCollection() {
        doTest(listOf("a", "c"), listOf("a", "bb", "c"))
    }

    @Test fun testCollectionWithEmptyStrings() {
        doTest(listOf("", "", "", ""), listOf("", "", "", "", "a", "bb", "ccc", "dddd"))
    }

    @Test fun testCollectionWithTwoGroupsOfMaximalSize() {
        doTest(listOf("a", "c"), listOf("a", "bb", "c", "dd"))
    }

    private fun doTest(expected: Collection<String>?, argument: Collection<String>) {
        assertEquals(
                expected, doSomethingStrangeWithCollection(argument), "The function 'doSomethingStrangeWithCollection' should do at least something with a collection:")
    }
}