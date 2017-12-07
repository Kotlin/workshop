package org.jetbrains.kotlinworkshop.advanced._3InlineFunctions

fun sendEmailTo(email: String) {
    /*...*/
}

fun example(email: String?) {

    if (email != null) sendEmailTo(email)
    email?.let { e -> sendEmailTo(e) }

    val e = getEmail()
    if (e != null) sendEmailTo(e)

    getEmail()?.let { sendEmailTo(it) }
}

inline fun <T, R> T.let(block: (T) -> R): R = block(this)

fun getEmail(): String? = null