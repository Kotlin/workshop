package org.jetbrains.kotlinworkshop.introduction._3Classes

class AnotherRectangle(val height: Int, val width: Int) {

    // you can redefine getter (and setter)
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    val rectangle = AnotherRectangle(41, 43)
    println(rectangle.isSquare)
}