package _5DelegatedProperties

class LazyProperty() {
    val lazy: Int by lazy {
        println("Calculate the value")
        42
    }
}

fun main(args: Array<String>) {
    println("--- creation ---")
    val property = LazyProperty()

    println("--- first access ---")
    property.lazy

    println("--- second access ---")
    property.lazy
}