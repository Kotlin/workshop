package org.jetbrains.kotlinworkshop.introduction._3Classes


class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }
}

val outer = Outer.Nested().foo() // == 2

class OuterWithInner {
    private val bar: Int = 1

    inner class Inner {
        fun foo() = bar
    }
}

val outerWithInner = OuterWithInner().Inner().foo() // == 1