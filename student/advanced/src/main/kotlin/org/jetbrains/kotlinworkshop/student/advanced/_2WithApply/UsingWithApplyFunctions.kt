package org.jetbrains.kotlinworkshop.student.advanced._2WithApply

class BreakfastMenuItem {
    var name: String? = null
    var price: Double? = null
    var calories: Int? = null
}

fun initializeMenuItem(): BreakfastMenuItem {
    val menuItem = BreakfastMenuItem()
    menuItem.name = "Belgian Waffles"
    menuItem.price = 5.95
    menuItem.calories = 650
    return menuItem
}

fun initializeMenuItem1(): BreakfastMenuItem {
    TODO("Rewrite the 'initializeMenuItem' function using 'with'")
}

fun initializeMenuItem2(): BreakfastMenuItem {
    TODO("Rewrite the 'initializeMenuItem' function using 'apply'")
}