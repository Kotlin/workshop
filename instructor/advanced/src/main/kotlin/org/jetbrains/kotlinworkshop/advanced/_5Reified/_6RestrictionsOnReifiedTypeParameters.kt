package org.jetbrains.kotlinworkshop.advanced._5Reified

// Which of the following calls won't compile?

//inline fun <reified T> foo(t: T) {
//    bar(t)
//}

fun <T> bar(t: T) {
//    foo(t)
}