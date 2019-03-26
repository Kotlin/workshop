package org.jetbrains.kotlinworkshop.student.single._3TaxiPark

// Find all passengers that were taken by this driver more than once
fun TaxiPark.findFrequentPassengers(driver: Driver): List<Passenger> =
        allPassengers.filter { isFrequentPair(driver, it) }

private fun TaxiPark.isFrequentPair(driver: Driver, passenger: Passenger) =
        orders.count { driver == it.driver && passenger in it.passengers } > 1
