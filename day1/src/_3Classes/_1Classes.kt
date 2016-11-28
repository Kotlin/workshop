package classes

// similar to javaCode.Person

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    // no new keyword, constructor is called as a regular function
    val person = Person("Alice", 26)

    println(person.name)
}