package org.jetbrains.kotlinworkshop.student.single._8Conventions

import org.jetbrains.kotlinworkshop.student.single._8Conventions.TimeInterval.*

/*
Task: Uncomment the commented code and make it compile by changing the MyDate class.
 */

fun task1(date1: MyDate, date2: MyDate): Boolean {
    return date1 < date2
}

fun task2(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}

fun task3(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}

fun task4(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task5(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
