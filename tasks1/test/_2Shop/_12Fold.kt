package _2Shop

import _2Shop.data.*
import _2Shop.shopBuilders.customer
import _2Shop.shopBuilders.order
import _2Shop.shopBuilders.shop
import org.junit.Assert.assertEquals
import org.junit.Test


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
