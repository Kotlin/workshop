package org.jetbrains.kotlinworkshop.introduction._10Conventions

import java.lang.*


data class Time(val hours: Int, val mins: Int) {
    operator fun plus(time: Time): Time {
        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach { this.append(it) }
}

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Int): Point {
    return Point(x * scale, y * scale)
}

fun main(args: Array<String>) {

    val newTime = Time(10, 40) + Time(3, 20)

    println(newTime)

    val sb = StringBuilder()
    for (str in sb) {
        str + "Value"
    }

    val p1 = Point(1, 2) + Point(2, 3)
    val p2 = Point(1, 2) * 3
    println(p1)
    println(p2)

}