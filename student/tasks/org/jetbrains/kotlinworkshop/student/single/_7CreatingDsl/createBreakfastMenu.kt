package org.jetbrains.kotlinworkshop.student.single._7CreatingDsl

fun createCustomMenu() = breakfastMenu {
    item {
        name = "Belgian Waffles"
        price = 5.95
        calories = 650
    }
    item {
        name = "Strawberry Belgian Waffles"
        price = 7.95
        calories = 900
    }
    item {
        name = "Berry-Berry Belgian Waffles"
        price = 8.95
        calories = 900
    }
    item {
        name = "French Toast"
        price = 4.50
        calories = 600
    }
    item {
        name = "Homestyle Breakfast"
        price = 6.95
        calories = 950
    }
}