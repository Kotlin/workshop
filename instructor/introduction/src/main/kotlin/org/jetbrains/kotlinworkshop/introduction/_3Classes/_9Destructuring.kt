package org.jetbrains.kotlinworkshop.introduction._3Classes


fun main(args: Array<String>) {

    val (country, city) = Pair("Spain", "Madrid")


    val (country1, city1, continent1) = Triple("Spain", "Madrid", "Europe")

    val (_, age) = Person("Joe Smith", 42)

}