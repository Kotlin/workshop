package org.jetbrains.kotlinworkshop.student.single._7CreatingDsl

// Another bonus (Kotlin 1.1 feature).
// Add the marker annotation to make impossible using "item" inside another "item".
// The code below shouldn't compile.
// See _3HtmlBuilders/html.kt for the example if necessary.

fun createErroneousMenu() = breakfastMenu {
    item {
        name = "Belgian Waffles"
        price = 5.95
        calories = 650

        // using "item" shouldn't compile
        item {
            name = "Strawberry Belgian Waffles"
            price = 7.95
            calories = 900
        }
    }
}