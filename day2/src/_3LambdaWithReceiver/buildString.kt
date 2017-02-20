package _3LambdaWithReceiver

fun usingWith() {
    val sb = StringBuilder()
    val s = with(sb) {
        appendln("Alphabet: ")
        for (c in 'a'..'z') {
            append(c)
        }
        toString()
    }
    println(s)
}

fun usingApply() {
    val s = StringBuilder().apply {
        appendln("Alphabet: ")
        for (c in 'a'..'z') {
            append(c)
        }
    }.toString()
    println(s)
}

fun usingBuildString() {
    val s = buildString {
        appendln("Alphabet: ")
        for (c in 'a'..'z') {
            append(c)
        }
    }
    println(s)
}