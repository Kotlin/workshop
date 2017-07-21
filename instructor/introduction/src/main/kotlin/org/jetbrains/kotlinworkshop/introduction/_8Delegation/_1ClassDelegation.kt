package org.jetbrains.kotlinworkshop.introduction._8Delegation

import org.jetbrains.kotlinworkshop.introduction._Shared.*


interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}

class Controller(repository: Repository, logger: Logger) : Repository by repository, Logger by logger {


}