package org.jetbrains.kotlinworkshop.advanced._7FunctionalConstructs


infix fun <A, B> Maybe<(A) -> B>.apply(f: Maybe<A>): Maybe<B> =
        when (this) {
            is Maybe.None -> Maybe.None
            is Maybe.Just -> f.fmap(this.value)
        }

infix inline fun <A, reified B> Array<(A) -> B>.apply(a: Array<A>) =
        Array(this.size * a.size) {
            this[it / a.size](a[it % a.size])
        }


fun main() {

}
