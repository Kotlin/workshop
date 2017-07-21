package org.jetbrains.kotlinworkshop.student.advanced._5Conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

class DateRange(val start: MyDate, val endInclusive: MyDate)

operator fun MyDate.rangeTo(other: MyDate): DateRange = TODO()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}