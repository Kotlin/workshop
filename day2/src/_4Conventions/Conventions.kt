package _4Conventions

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list + 4)  // [1, 2, 3, 4]
    println(list.plus(4))  // [1, 2, 3, 4]
    println(list - 2)  // [1, 3]

    val mutableList = mutableListOf(1, 2, 3)
    mutableList += 4  // [1, 2, 3, 4]

    val s1 = "abc"
    val s2 = "def"
    s1 < s2   // s1.compareTo(s2) < 0
    s1 > s2
    s1 <= s2
    s1 >= s2

    val map = mutableMapOf(1 to "one", 2 to "two")
    val key = 3
    val value = "three"
    map[key]           // operator get
    map[key] = value   // operator set

    println(map[3])

    println(3 in map)

    1..2
    "abc".."def"

    for (i in 1..2) { }
    for (ch in "abc") { }
    "abc".iterator()

//    for (s in "abc".."def") { } - doesn't make sense

    val (i, s) = 1 to "s"
    val pair = 1 to "s"
    val ii = pair.component1()
    val ss = pair.component2()

    val (iii, sss) = Foo(1, "")
}

data class Foo(val i: Int, val s: String)