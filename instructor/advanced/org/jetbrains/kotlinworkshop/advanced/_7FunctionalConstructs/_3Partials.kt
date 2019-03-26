package org.jetbrains.kotlinworkshop.advanced._7FunctionalConstructs


class Partial<T>

fun <T> partial(): Partial<T> = Partial()

fun <P1, P2, R> Function2<P1, P2, R>.createPartialFunction(p1:
                                            P1, partial2: Partial<P2> = partial()): (P2) -> R {
    return { p2: P2 -> this(p1, p2) }
}

fun <P1, P2, R> Function2<P1, P2, R>.createPartialFunction(partial1: Partial<P1> = partial(),
                                                           p2: P2): (P1) -> R {
    return { p1: P1 -> this(p1, p2) }
}


fun <P1, P2, P3, P4, P5, R> Function5<P1, P2, P3, P4, P5, R>.createPartialFunction(partial1: Partial<P1> = partial(),
                                                                                   partial2: Partial<P2> = partial(),
                                                                                   partial3: Partial<P3> = partial(),
                                                                                   partial4: Partial<P4> = partial(),
                                                                                   p5: P5): (P1, P2, P3, P4) -> R {
    return { p1: P1, p2: P2, p3: P3, p4: P4 -> this(p1, p2, p3, p4, p5) }
}

fun <P1, P2, P3, P4, R> Function4<P1, P2, P3, P4, R>.createPartialFunction(partial1: Partial<P1> = partial(),
                                                                           partial2: Partial<P2> = partial(),
                                                                           partial3: Partial<P3> = partial(),
                                                                           p4: P4): (P1, P2, P3) -> R {
    return { p1: P1, p2: P2, p3: P3 -> this(p1, p2, p3, p4) }
}

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.createPartialFunction(partial1: Partial<P1> = partial(),
                                                                   partial2: Partial<P2> = partial(),
                                                                   p3: P3): (P1, P2) -> R {
    return { p1: P1, p2: P2 -> this(p1, p2, p3) }
}

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.createPartialFunction(partial1: Partial<P1> = partial(),
                                                                   p2: P2,
                                                                   partial3: Partial<P3> = partial()): (P1, P3) -> R {
    return { p1: P1, p3: P3 -> this(p1, p2, p3) }
}

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.createPartialFunction(p1: P1,
                                                                   partial2: Partial<P1> = partial(),
                                                                   p3: P3): (P2) -> R {
    return { p2: P2 -> this(p1, p2, p3) }
}


fun main() {

    val sum = { x: Int, y: Int -> x + y }


    val addToTwo = sum.createPartialFunction(2)


    println(addToTwo(5))

}