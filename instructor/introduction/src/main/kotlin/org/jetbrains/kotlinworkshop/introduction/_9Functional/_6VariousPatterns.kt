package org.jetbrains.kotlinworkshop.introduction._9Functional


data class Customer(val id: String, val name: String, val type: String, val country: String)


// Filter Pattern
class CustomerFilter {
    fun filterByName(customers: List<Customer>, name: String): List<Customer> {
        val matchedCustomers = arrayListOf<Customer>()
        for (customer in customers) {
            if (customer.name == name) {
                matchedCustomers.add(customer)
            }
        }
        return matchedCustomers
    }

    fun filterByCountry(customers: List<Customer>, country: String): List<Customer> {
        val matchedCustomers = arrayListOf<Customer>()
        for (customer in customers) {
            if (customer.country == country) {
                matchedCustomers.add(customer)
            }
        }
        return matchedCustomers
    }
}


// Strategy Pattern
interface SortAlgorithm {
    fun <T: Comparable<T>> sort(list: List<T>): List<T>
}

class QuickSort : SortAlgorithm {
    override fun <T: Comparable<T>> sort(list: List<T>): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class BubbleSort : SortAlgorithm {
    override fun <T: Comparable<T>> sort(list: List<T>): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}


// Template Patterns
abstract class Record {
    abstract fun edit()
    abstract fun save()
    fun checkPermissions() {

    }

    fun modify() {
        checkPermissions()
        edit()
        save()
    }
}

class CustomerRecord : Record() {
    override fun edit() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class InvoiceRecord : Record() {
    override fun edit() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}


// Clean-ups > using statement
