package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

class TaxiPark(
        val allDrivers: List<Driver>,
        val allPassengers: List<Passenger>,
        val orders: List<Order>)

data class Driver(val name: String)
data class Passenger(val name: String)

data class Order(
        val driver: Driver,
        val passengers: Collection<Passenger>,
        val duration: Int,
        val distance: Double,
        val discount: Double? = null
) {
    val cost: Double
        get() = (1 - (discount ?: 0.0)) * (duration + distance)
}