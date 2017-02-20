package _1BreakingSafety

import _1BreakingSafety.JavaClass.dangerousJavaMethod

fun mightContainNull(): List<Int> {
    val list: List<Int> = arrayListOf(1, 2, 3)
    // try to add 'null' value to the list of int's in 'dangerousJavaMethod'
    dangerousJavaMethod(list)
    return list
}