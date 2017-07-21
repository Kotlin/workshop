package org.jetbrains.kotlinworkshop.introduction._3Classes

class Rectangle(val height: Int, val width: Int) {

    //secondary constructors
    constructor(side: Int) : this(side, side)
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(42)
    println(rectangle.height == rectangle.width)
}