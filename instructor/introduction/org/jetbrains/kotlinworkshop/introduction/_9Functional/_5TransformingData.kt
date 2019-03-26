package org.jetbrains.kotlinworkshop.introduction._9Functional

import org.jetbrains.kotlinworkshop.introduction._Shared.*


// Adding an intermediate structure

fun hitYears_v1(albums: List<Album>): List<Int> {
    val hits = albums.filter { it.chartUS == 1 || it.chartUK == 1 }
    val years = arrayListOf<Int>()
    hits.forEach {
        years.add(it.year)
    }
    return years
}

// Using transformation functions

fun hitYears_v2(albums: List<Album>): List<Int> {
    return albums.filter { it.chartUS == 1 || it.chartUK == 1 }.map { it.year }
}

