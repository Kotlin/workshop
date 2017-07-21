package org.jetbrains.kotlinworkshop.introduction._9Functional


fun itDoesSomething(elements: List<String>): HashMap<String, Int> {
    var i = 0
    val results = hashMapOf<String, Int>()
    while (i < elements.size) {
        val element = results[elements[i]]
        if (element != null) {
            results[elements[i]] = element + 1
        } else {
            results[elements[i]] = 1
        }
        i++
    }
    return results
}


fun itDoesSomethingAlso(elements: List<String>): List<Pair<String, Int>> {
    return elements.groupBy {
        it
    }.map {
        Pair(it.key, it.value.count())
    }
}
