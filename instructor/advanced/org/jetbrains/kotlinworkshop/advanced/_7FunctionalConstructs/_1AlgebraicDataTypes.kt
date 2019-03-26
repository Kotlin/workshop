package org.jetbrains.kotlinworkshop.advanced._7FunctionalConstructs


sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int = when (e) {
    is Expr.Num -> e.value
    is Expr.Sum -> eval(e.left) + eval(e.right)
}

fun main() {
    // 1 + (2 + 3)
    println(eval(Expr.Sum(Expr.Num(1), Expr.Sum(Expr.Num(2), Expr.Num(3)))))
}


sealed class Result

class Success : Result()
class Failure : Result()
