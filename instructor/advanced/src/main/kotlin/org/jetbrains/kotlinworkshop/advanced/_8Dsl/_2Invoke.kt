package org.jetbrains.kotlinworkshop.advanced._8Dsl


class FooClass {
    var name: String = ""
    operator fun invoke(name: String) {
        println("Hello $name")
    }
}


fun main(args: Array<String>) {
    val foo = FooClass()
    foo("Something")
    println(foo.name)
}