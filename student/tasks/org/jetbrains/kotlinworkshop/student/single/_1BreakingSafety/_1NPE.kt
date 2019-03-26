package org.jetbrains.kotlinworkshop.student.single._1BreakingSafety


fun mightThrowNPE() {
    // change 'JavaClass.getValue' to make the call below throw NPE
    println(JavaClass().value.length)
}