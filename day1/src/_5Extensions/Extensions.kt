//@file:JvmName("StringUtil")
package _5Extensions

fun String.lastChar() =
        this.get(this.length - 1)

// 'this' can be omitted
fun String.lastChar1() =
        get(length - 1)

fun test() {
    // visible in completion
    "abc".lastChar()
}