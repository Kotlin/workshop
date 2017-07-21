@file:JvmName("Foo")

package org.jetbrains.kotlinworkshop.advanced._2Interop



class Employee {
    // @JvmField will make this a field and eliminate property accessors
    var field = ""
}

fun process(input: List<Int>) {

}

@JvmName("processStrings")
fun process(input: List<String>) {

}