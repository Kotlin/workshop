package org.jetbrains.kotlinworkshop.student.single._3TaxiPark

import java.math.BigDecimal

// Check whether 20% of the drivers make 80% of the profit
fun TaxiPark.checkParetoPrinciple(): Boolean {
    val profitPerDriver = allDrivers
            .map { driver -> orders.filter { it.driver == driver }.sumByDouble { it.cost } }
            .sortedDescending()
    val firstTwenty = profitPerDriver.take(profitPerDriver.size / 5).sum()
    val all = profitPerDriver.sum()
    return BigDecimal(firstTwenty) >= BigDecimal(all) * BigDecimal(0.8)
}