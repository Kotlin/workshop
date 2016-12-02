package _7Generics

/*
Add a 'partitionTo' function that splits a collection into two collections according to the predicate.
Uncomment the commented invocations of 'partitionTo' below and make them compile.

There is a 'partition()' function in the standard library that always returns two newly created lists.
You should write a function that splits the collection into two collections given as arguments.
The signature of the 'toCollection()' function from the standard library might help you.
*/

fun List<String>.partitionWordsAndLines(): Pair<List<String>, List<String>> {
    TODO()
//    return partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
}

fun Set<Char>.partitionLettersAndOtherSymbols(): Pair<Set<Char>, Set<Char>> {
    TODO()
//    return partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
}