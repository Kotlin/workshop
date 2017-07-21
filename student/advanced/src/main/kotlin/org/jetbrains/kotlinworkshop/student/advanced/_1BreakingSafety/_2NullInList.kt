package org.jetbrains.kotlinworkshop.student.advanced._1BreakingSafety

import org.jetbrains.kotlinworkshop.student.advanced._1BreakingSafety.JavaClass.*


fun mightContainNull(): List<Int> {
    val list: List<Int> = arrayListOf(1, 2, 3)
    // try to add 'null' value to the list of int's in 'dangerousJavaMethod'
    dangerousJavaMethod(list)
    return list
}