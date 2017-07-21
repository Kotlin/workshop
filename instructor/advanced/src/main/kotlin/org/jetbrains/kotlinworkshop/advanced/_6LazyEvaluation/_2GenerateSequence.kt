package org.jetbrains.kotlinworkshop.advanced._6LazyEvaluation


fun main(args: Array<String>) {


    generateSequence(1) {
        it * 10
    }.take(300).map { it % 5 }


}