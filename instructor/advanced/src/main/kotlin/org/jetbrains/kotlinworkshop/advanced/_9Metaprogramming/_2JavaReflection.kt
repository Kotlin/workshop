package org.jetbrains.kotlinworkshop.advanced._9Metaprogramming

import java.lang.reflect.*

class Transaction(val id: Int, val amount: Double, var description: String = "Default Value") {
    fun validate() {
        if (amount > 10000) {
            println("org.jetbrains.kotlinworkshop.advanced._9Metaprogramming.Transaction is too large")
        }
    }
}

fun introspectInstance(obj: Any) {

    println("Class ${obj.javaClass.simpleName}")
    println("Properties\n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type ${it.type}")
    }
    println("Functions\n")
    obj.javaClass.declaredMethods.forEach {
        println("${it.name}")
    }

}

fun getType(obj: Type) {
    println(obj.typeName)
}

fun main(args: Array<String>) {
    getType(Transaction::class.java)

    // introspectInstance(Transaction(1, 200.0, "A simple transaction"))
}