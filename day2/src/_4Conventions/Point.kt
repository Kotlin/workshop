package _4Conventions

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Int): Point {
    return Point(x * scale, y * scale)
}

fun main(args: Array<String>) {
    val p1 = Point(1, 2) + Point(2, 3)
    val p2 = Point(1, 2) * 3
    println(p1)
    println(p2)
}