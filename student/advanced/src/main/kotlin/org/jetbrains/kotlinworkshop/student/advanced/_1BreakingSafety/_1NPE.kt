package org.jetbrains.kotlinworkshop.student.advanced._1BreakingSafety

fun mightThrowNPE() {
    // change 'JavaClass.getValue' to make the call below throw NPE
    println(JavaClass().value.length)
}