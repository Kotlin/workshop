package sealedClasses

import sealedClasses.Expr.*

sealed class Expr {
    class Num(val value : Int) : Expr()
    class Sum(val left : Expr, val right : Expr) : Expr()
}

fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
}

fun main(args: Array<String>) {
    // 1 + (2 + 3)
    println(eval(Sum(Num(1), Sum(Num(2), Num(3)))))
}