package org.jetbrains.kotlinworkshop.introduction._3Classes


typealias CustomerName = String


// Example of using typealias for rename with @Deprecated


@Deprecated("BasicCustomer is now called BaseCustomer", replaceWith = ReplaceWith("BaseCustomer"))
class BaseCustomer // before was called BasicCustomer

typealias BasicCustomer = BaseCustomer




fun main(args: Array<String>) {


    val customer = BasicCustomer()

}