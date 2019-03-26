package org.jetbrains.kotlinworkshop.student.single._3TaxiPark

// Find all passengers having more than 'minTrips' number of trips
fun TaxiPark.findFaithfulPassengers(minTrips: Int): List<Passenger> =
        allPassengers.filter { isFaithfulPassenger(it, minTrips) }

private fun TaxiPark.isFaithfulPassenger(passenger: Passenger, minTrips: Int): Boolean =
        orders.count { it.passengers.contains(passenger) } > minTrips
