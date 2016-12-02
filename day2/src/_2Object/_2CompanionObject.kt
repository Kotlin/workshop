package _2Object

interface Factory<T> {
    fun create(): T
}

// Companion object can implement an interface
class A {
    private constructor()

    companion object : Factory<A> {
        override fun create(): A {
            return A()
        }

        // to make it static use annotation
        @JvmStatic
        fun staticFunction() {}
    }
}