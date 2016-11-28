package _8InlineFunctions

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

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