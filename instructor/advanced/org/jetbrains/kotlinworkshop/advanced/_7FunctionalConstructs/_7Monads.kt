package org.jetbrains.kotlinworkshop.advanced._7FunctionalConstructs


sealed class MaybeMonad<out A> {
    object None : MaybeMonad<Nothing>()
    data class Just<out A>(val value: A) : MaybeMonad<A>()

    inline fun <B> fmap(f: (A) -> B): MaybeMonad<B> = when (this) {
        is None -> this
        is Just -> Just(f(value))
    }

    infix inline fun <B> bind(f: (A) -> MaybeMonad<B>): MaybeMonad<B> = when (this) {
        is None -> this
        is Just -> f(value)
    }
}


fun half(a: Int) = when {
    a % 2 == 0 -> MaybeMonad.Just(a / 2)
    else -> MaybeMonad.None
}


fun main() {
    MaybeMonad.Just(20) bind ::half
}