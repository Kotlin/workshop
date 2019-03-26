package org.jetbrains.kotlinworkshop.student.single._3TaxiPark

import java.util.*

// Find passengers that used discounts for majority of the trips
fun TaxiPark.findSmartPassengers(): Set<Passenger> =
        allPassengers.filterTo(HashSet()) { isSmartPassenger(it) }

fun TaxiPark.getOrdersForPassenger(passenger: Passenger): Collection<Order> =
        orders.filter { passenger in it.passengers }

fun TaxiPark.isSmartPassenger(passenger: Passenger): Boolean {
    val (ordersWithDiscount, ordersWithoutDiscount) =
            getOrdersForPassenger(passenger).partition { it.discount != null }
    return ordersWithDiscount.size > ordersWithoutDiscount.size
}
