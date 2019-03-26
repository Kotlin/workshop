package org.jetbrains.kotlinworkshop.student.single._7CreatingDsl

@DslMarker
annotation class MenuItemMarker

@MenuItemMarker
class BreakfastMenuItem {
    var name: String? = null
    var price: Double? = null
    var calories: Int? = null
}

@MenuItemMarker
class BreakfastMenu {
    val items = mutableListOf<BreakfastMenuItem>()
}

fun BreakfastMenu.item(init: BreakfastMenuItem.() -> Unit) {
    items += BreakfastMenuItem().apply(init)
}

fun breakfastMenu(init: BreakfastMenu.() -> Unit): BreakfastMenu =
    BreakfastMenu().apply(init)