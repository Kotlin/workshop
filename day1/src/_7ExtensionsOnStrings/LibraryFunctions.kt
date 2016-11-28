package libraryFunctions

// filter, count,
// any, all, none, find
// withIndex, zip
// (map, flatMap, maxBy, partition)

fun main(args: Array<String>) {
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