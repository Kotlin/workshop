package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.introduction._2Shop.*
import org.junit.jupiter.api.*
import kotlin.test.*

class _13CompoundTasks {
    @Test fun testGetCustomersWhoOrderedProduct() {
        assertEquals(setOf(customers[reka], customers[asuka]), shop.getCustomersWhoOrderedProduct(idea))
    }

    @Test fun testMostExpensiveDeliveredProduct() {
        val testShop = shop("test shop for 'most expensive delivered product'") {
            customer(lucas, Canberra) {
                order(isDelivered = false, products = idea)
                order(reSharper)
            }
        }
        assertEquals(reSharper, testShop.customers[0].getMostExpensiveDeliveredProduct())
    }

    @Test fun testNumberOfTimesEachProductWasOrdered() {
        assertEquals(4, shop.getNumberOfTimesProductWasOrdered(idea))
    }

    @Test fun testNumberOfTimesEachProductWasOrderedForRepeatedProduct() {
        assertEquals(
                3, shop.getNumberOfTimesProductWasOrdered(reSharper), "A customer may order a product for several times")
    }

    @Test fun testNumberOfTimesEachProductWasOrderedForRepeatedInOrderProduct() {
        assertEquals(
                3, shop.getNumberOfTimesProductWasOrdered(phpStorm), "An order may contain a particular product more than once")
    }
}
