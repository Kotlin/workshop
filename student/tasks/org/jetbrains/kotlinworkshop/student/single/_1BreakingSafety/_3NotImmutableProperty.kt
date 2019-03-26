package org.jetbrains.kotlinworkshop.student.single._1BreakingSafety

class MyClass {
    // Change the implementation of 'myProperty' to make it return different values each time.
    // You may add additional properties if you need.
    private var counter = 0

    val myProperty: Int
        get() = counter++
}