package lambdas

fun basicSyntax() {
    val sum = { x: Int, y: Int -> x + y }

    val sum1: (Int, Int) -> Int = { x, y -> x + y }

    println(sum(1, 2)) // 3
}

fun shortSyntax() {
    val string = "one, two, three"

    println(string.filter({ c: Char -> c in 'a'..'z' }))   // "onetwothree"

    string.filter() { c: Char -> c in 'a'..'z' }

    string.filter { c: Char -> c in 'a'..'z' }

    string.filter { c -> c in 'a'..'z' }

    string.filter { it in 'a'..'z' }

    string.filter {
        it in 'a'..'z'
    }

    val s = "abCDa"

    println(s.filter { it in 'a'..'z' }) // aba
    println(s.count { it in 'a'..'z' }) //3

    "abCDa".any { it in '1'..'9' }  // false
    "abCDa1".any { it in '1'..'9' } // true
    // true if there at least one character satisfying the predicate

    "abCDa".all { it.toInt() < 200 }
    "abd33".find { it > 'c' }  // d

    for ((index, ch) in "abc".withIndex()) {

    }

    println("abcd".zip("1234"))

    "abCDa".any { it in 'a'..'z' }
    "abCDa".count { it in 'a'..'z' }
    "abCDa".find { it in 'a'..'z' }
    "abCDa".zip("79371").joinToString()
}

fun main(args: Array<String>) {
    basicSyntax()
    shortSyntax()
}