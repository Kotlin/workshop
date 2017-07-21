package org.jetbrains.kotlinworkshop.advanced._3InlineFunctions

import java.util.concurrent.locks.*
import kotlin.concurrent.*

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun main(args: Array<String>) {

    val l = ReentrantLock()

    synchronized(l) {
        // ...
    }

    l.withLock {
        // ...
    }
}