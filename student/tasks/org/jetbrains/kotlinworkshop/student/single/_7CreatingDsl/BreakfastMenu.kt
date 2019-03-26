package org.jetbrains.kotlinworkshop.student.single._7CreatingDsl

class BreakfastMenuItem {
    var name: String? = null
    var price: Double? = null
    var calories: Int? = null
}

class BreakfastMenu {
    val items = mutableListOf<BreakfastMenuItem>()
}

fun BreakfastMenu.item(init: BreakfastMenuItem.() -> Unit) {
    TODO("Create new menu item, initialize it and add it to the 'items' list")
}

fun breakfastMenu(init: BreakfastMenu.() -> Unit): BreakfastMenu {
    TODO("Create new BreakfastMenu and initialize it. All the items are added by 'init'.")
    // bonus: use the 'apply' function
}