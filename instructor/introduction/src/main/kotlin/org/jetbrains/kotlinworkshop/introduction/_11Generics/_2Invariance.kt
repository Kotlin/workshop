package org.jetbrains.kotlinworkshop.introduction._11Generics


fun invariant() {
    val elements: MutableList<Any>
    val strings: MutableList<String> = mutableListOf("A", "B", "C")

    // The line below won't compile

    //  elements = strings
}

