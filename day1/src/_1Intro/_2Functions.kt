package _1Intro

fun max(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun max2(a: Int, b: Int) = if (a < b) a else b

// default values for arguments
fun sum(a: Int, b: Int, c: Int = 0) = a + b + c

fun use() {
    sum(1, 2)
    sum(1, 2, 3)
    // named arguments
    sum(b = 2, a = 1)
}