package org.jetbrains.kotlinworkshop.introduction._9Functional


fun maxNumbers(list: List<Int>): Int {
    when (list.count()) {
        0 -> throw IllegalArgumentException("This list is empty")
        1 -> return list[0]
        else -> return Math.max(list[0], maxNumbers(tail(list)))

    }
}


fun maxNumbersFold(list: List<Int>): Int {
    return list.fold(0, { x, y -> Math.max(x, y) })
}