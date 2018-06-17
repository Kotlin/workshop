package org.jetbrains.kotlinworkshop.student.single._8Conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

class DateRange(val start: MyDate, val endInclusive: MyDate)

operator fun MyDate.rangeTo(other: MyDate): DateRange = TODO()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}