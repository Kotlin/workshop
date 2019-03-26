package org.jetbrains.kotlinworkshop.advanced._7FunctionalConstructs


sealed class Maybe<out A> {
    object None : Maybe<Nothing>()
    data class Just<out A>(val value: A) : Maybe<A>()

    inline fun <B> fmap(f: (A) -> B): Maybe<B> = when (this) {
        is None -> this
        is Just -> Just(f(value))
    }
}


fun maybeReturnSomething(input: Boolean): Maybe<Int> {
    return if (input) Maybe.Just(10) else Maybe.None
}

fun main() {


    println(Maybe.Just(4).fmap { it + 10 })


    val someResult: Maybe<Int> = maybeReturnSomething(false)
    someResult.fmap { it + 10 }

    println(someResult)
}