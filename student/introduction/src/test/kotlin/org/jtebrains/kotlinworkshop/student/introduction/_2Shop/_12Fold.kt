package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.introduction._2Shop.getSetOfProductsOrderedByEveryCustomer
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class _12Fold {
    @Test fun testGetProductsOrderedByAllCustomers() {
        val testShop = shop("test shop for 'fold'") {
            customer(lucas, Canberra) {
                order(idea)
                order(webStorm)
            }
            customer(reka, Budapest) {
                order(idea)
                order(youTrack)
            }
        }
        assertEquals(setOf(idea), testShop.getSetOfProductsOrderedByEveryCustomer())
    }
}
