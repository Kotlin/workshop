package org.jetbrains.kotlinworkshop.advanced._7FunctionalConstructs


fun <P1, P2, R> Function2<P1, P2, R>.curry(): (P1) -> (P2) -> R {
    return { p1: P1 -> { p2: P2 -> this (p1, p2)}}
}

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curry(): (P1) -> (P2) -> (P3) -> R {
    return { p1: P1 -> { p2: P2 -> { p3: P3 -> this (p1, p2, p3)}}}
}

fun main() {

    val sum = { x: Int, y: Int, z: Int -> x + y + z }

    val sumCurried = sum.curry()

    val result = sumCurried(3)(2)(5)

    println(result)
}

