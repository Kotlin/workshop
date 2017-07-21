package org.jetbrains.kotlinworkshop.introduction._4Generics

import org.jetbrains.kotlinworkshop.introduction._Shared.Customer
import org.jetbrains.kotlinworkshop.introduction._Shared.CustomerRepository


interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {

    val customerRepo = CustomerRepository<Customer>()

    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()





}
