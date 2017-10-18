package org.jetbrains.kotlinworkshop.introduction._3Classes


typealias CustomerName = String


// Example of using typealias for rename with @Deprecated


class BaseCustomer // before was called BasicCustomer

@Deprecated("BasicCustomer is now called BaseCustomer", replaceWith = ReplaceWith("BaseCustomer"))
typealias BasicCustomer = BaseCustomer




fun main(args: Array<String>) {


    val customer = BasicCustomer()

}