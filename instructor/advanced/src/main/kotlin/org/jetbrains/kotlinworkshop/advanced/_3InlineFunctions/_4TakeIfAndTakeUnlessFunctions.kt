package org.jetbrains.kotlinworkshop.advanced._3InlineFunctions

data class Contract(val info: String, val isSigned: Boolean)

fun main(args: Array<String>) {
    val contract1 = Contract("Kotlin training", true)
    println(contract1.takeIf { it.isSigned })  // contract1

    val contract2 = Contract("Other training", false)
    println(contract2.takeIf { it.isSigned })  // null

    val number = 42
    println(number.takeIf { it > 10 })   // 42

    val other = 2
    println(other.takeIf { it > 10 })    // null

    println(contract1.takeUnless { it.isSigned }) // null

    println(contract2.takeUnless { it.isSigned })  // contract2

    println(number.takeUnless { it > 10 })   // null

    println(other.takeUnless { it > 10 })    // 2
}