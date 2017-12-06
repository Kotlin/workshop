package org.jetbrains.kotlinworkshop.quizzes._7InlineAndLazyIteration

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3)
    val result = list.filter { it > 0 }


}

inline fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T> {
    val destination = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            destination.add(element)
        }
    }
    return destination
}