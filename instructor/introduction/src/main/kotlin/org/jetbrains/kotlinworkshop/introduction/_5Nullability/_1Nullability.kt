package org.jetbrains.kotlinworkshop.introduction._5Nullability

fun main(args: Array<String>) {

    val s1: String = "always not null"
    val s2: String? = null

    val i1: Int = s1.length
    // s2.length

    if (s2 != null) s2.length
    s2?.length

    val i2: Int? = if (s2 != null) s2.length else null
    val i3: Int? = s2?.length

    val i4: Int? = if (s2 != null) s2.length else 0
    val i5: Int = s2?.length ?: 0

    s2!!
}

fun test1(s: String?) {
    if (s == null) return
    s.length
}

fun test2(s: String?) {
    if (s == null) fail()
    s.length
}

fun test3(s: String?) {
    val i: Int = s?.length ?: fail()
}

fun fail(): Nothing =
        throw UnsupportedOperationException()

fun notImplemented() {
    TODO()
}