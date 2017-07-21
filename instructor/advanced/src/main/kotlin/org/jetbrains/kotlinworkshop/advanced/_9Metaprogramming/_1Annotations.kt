package org.jetbrains.kotlinworkshop.advanced._9Metaprogramming


@Target(AnnotationTarget.CLASS)
annotation class Table(val name: String)

@Target(AnnotationTarget.PROPERTY)
annotation class Field(val name: String)


@Table(name = "ContactTable")
data class Contact(val id: Int, @Field(name = "NAME") val name: String, val email: String)


fun main(args: Array<String>) {

    val annotation = Contact::class.annotations.find { it.annotationClass.simpleName == "Table" }

    println(annotation)


}

