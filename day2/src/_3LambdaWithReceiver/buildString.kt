package _3LambdaWithReceiver

fun main(args: Array<String>) {
    val sb = StringBuilder()
    with(sb) {
        appendln("Alphabet: ")
        for (c in 'a'..'z') {
            append(c)
        }
        toString()
    }
    println(sb)
}