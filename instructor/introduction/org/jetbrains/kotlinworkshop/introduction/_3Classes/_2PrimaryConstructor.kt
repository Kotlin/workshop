package org.jetbrains.kotlinworkshop.introduction._3Classes

/* short syntax */
class Person1(val name: String)

/* full syntax */
//           constructor parameter
class Person2(name: String) {

    // property
    val name: String

    // constructor body
    init {
        this.name = name
    }
}
