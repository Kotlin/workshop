package _1BreakingSafety

import _1BreakingSafety.JavaClass.dangerousJavaMethod

fun mightContainNull(): List<Int> {
    val list: List<Int> = arrayListOf(1, 2, 3)
    // change the implementation of the `dangerousJavaMethod`
    // so that it add `null` values in the list
    dangerousJavaMethod(list)
    return list
}