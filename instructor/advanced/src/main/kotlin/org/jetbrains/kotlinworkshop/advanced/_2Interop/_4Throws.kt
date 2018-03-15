package org.jetbrains.kotlinworkshop.advanced._2Interop

import java.io.*

//@Throws(IOException::class)
fun throwsException(value: String) {
    throw IOException("Java needs to know this")
}