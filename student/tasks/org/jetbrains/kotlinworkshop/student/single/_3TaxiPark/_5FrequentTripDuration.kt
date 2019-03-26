package org.jetbrains.kotlinworkshop.student.single._3TaxiPark

// Find the most frequent trip interval duration (or several if there are many)
// among 0-9 minutes, 10-19 minutes, 20-29 minutes etc.
// If there's no duration info, return empty list.
fun TaxiPark.findTheMostFrequentTripDurations(): List<IntRange> {
    val rangesPopularity = kotlin.collections.mutableMapOf<IntRange, Int>()
    orders.forEach { order ->
        val range = order.getDurationRange()
        val currentFrequency = rangesPopularity[range] ?: 0
        rangesPopularity[range] = currentFrequency + 1
    }
    println(rangesPopularity)
    val maxValue = rangesPopularity.maxBy { it.value }?.value ?: return emptyList()
    return rangesPopularity.filter { it.value == maxValue }.map { it.key }
}

fun Order.getDurationRange(): IntRange {
    val start = 10 * (duration / 10)
    return kotlin.ranges.IntRange(start, start + 9)
}