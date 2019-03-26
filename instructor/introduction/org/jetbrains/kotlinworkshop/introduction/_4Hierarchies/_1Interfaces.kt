package org.jetbrains.kotlinworkshop.introduction._4Hierarchies

import org.jetbrains.kotlinworkshop.introduction._Shared.*

interface CustomerRepository {
    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer) {
        // implement code to store
    }

    fun getById(id: Int): Customer
}

