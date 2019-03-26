package org.jetbrains.kotlinworkshop.introduction._7Lambdas

fun main() {
    val map = mapOf(1 to "one", 2 to "two")
    map.forEach { entry ->
        val (key, value) = entry
        println(value)
    }
    map.forEach { (key, value) ->
        println(value)
    }
    map.forEach { (_, value) ->
        println(value)
    }
}