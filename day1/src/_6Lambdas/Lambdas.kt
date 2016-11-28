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
}

fun main(args: Array<String>) {
    basicSyntax()
    shortSyntax()
}