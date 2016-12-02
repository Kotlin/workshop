package _1BreakingSafety

fun mightThrowNPE() {
    // change the implementation of the `getValue` property
    // so that the call below throw NPE
    println(JavaClass().value.length)
}