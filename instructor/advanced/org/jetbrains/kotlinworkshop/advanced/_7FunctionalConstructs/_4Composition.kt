package org.jetbrains.kotlinworkshop.advanced._7FunctionalConstructs


// f(g(x))
fun <FP1, RF, RP1> Function1<FP1, RF>.compose(g: (RP1) -> FP1): (RP1) -> RF {
    return { p1: RP1 -> this(g(p1)) }
}

fun compose(f: (Int, Int) -> Int, g: (Int) -> Int): (Int, Int) -> Int {
    return { p1: Int, p2: Int -> g(f(p1, p2)) }
}

// g(f(x))
fun <GP1, RG, RF1> Function1<GP1, RG>.andThen(f: (RG) -> RF1): (GP1) -> RF1 {
    return { p1: GP1 -> f(this(p1)) }
}

fun compose1(f: (a: Any) -> Any, g: (a: Any) -> Any): (a: Any) -> Any {
    return { x: Any -> { g(f(x)) } }
}

fun sum(x: Int, y: Int) = x + y


fun squared(x: Int)  = x * x


fun main() {


    val sumSquared = compose(::sum, ::squared)

    println(sumSquared(2, 3))

}

