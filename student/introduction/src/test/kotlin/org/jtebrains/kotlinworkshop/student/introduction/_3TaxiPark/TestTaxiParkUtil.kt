package org.jtebrains.kotlinworkshop.student.introduction._3TaxiPark

import org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark.*

internal val drivers = (1..10).map { Driver("Driver$it") }
internal val passengers = (1..10).map { Passenger("Passenger$it") }

internal fun driver(i: Int) = drivers.getOrNull(i - 1) ?: throw IllegalArgumentException("Invalid driver index: $i")
internal fun passenger(i: Int) = passengers.getOrNull(i - 1) ?: throw IllegalArgumentException("Invalid passenger index: $i")

internal fun drivers(range: IntRange) = range.map(::driver)
internal fun drivers(vararg indices: Int) = indices.map(::driver)
internal fun passengers(range: IntRange) = range.map(::passenger)
internal fun passengers(vararg indices: Int) = indices.map(::passenger)

internal fun taxiPark(driverIndexes: IntRange, passengerIndexes: IntRange, orders: List<Order>) =
        TaxiPark(drivers(driverIndexes), passengers(passengerIndexes), orders.toList())

internal fun taxiPark(driverIndexes: IntRange, passengerIndexes: IntRange, vararg orders: Order) =
        taxiPark(driverIndexes, passengerIndexes, orders.toList())

internal fun order(driverIndex: Int, vararg passengerIndexes: Int, duration: Int = 10, distance: Double = 10.0, discount: Double? = null) =
        Order(driver(driverIndex), passengers(*passengerIndexes), duration, distance, discount)