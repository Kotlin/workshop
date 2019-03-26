package org.jetbrains.kotlinworkshop.introduction._9Functional


fun <T> head(list: List<T>): T {
    return when (list.count()) {
        0 ->
            throw IllegalArgumentException("Cannot ask for head on empty list")
        else -> list[0]
    }
}


fun <T> cons(element: T, list: List<T>): List<T> {
    return when (list.count()) {
        0 -> listOf(element)
        1 -> listOf(element, head(list))
        else -> listOf(element).plus(list)
    }
}


fun <T> tail(list: List<T>): List<T> {
    return when (list.count()) {
        0 -> throw IllegalArgumentException("Cannot ask for tail on empty list")
        1 -> emptyList()
        else -> list.drop(1)
    }
}
