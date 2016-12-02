package _6Reified

import java.util.*

class Service

fun main(args: Array<String>) {

    ServiceLoader.load(Service::class.java)

    loadService<Service>()
}

inline fun <reified T: Any> loadService() =
    ServiceLoader.load(T::class.java)
