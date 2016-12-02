package _5DelegatedProperties

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Person(
        val name: String, age: Int, salary: Int
) {
    private val observer = {
        prop: KProperty<*>, oldValue: Int, newValue: Int ->
        println("Property value $oldValue has changed to $newValue")
    }
    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
}

fun main(args: Array<String>) {
    val person = Person("Alice", 25, 2000)
    person.age++
    person.salary += 100
}