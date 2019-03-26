package org.jetbrains.kotlinworkshop.introduction._8Delegation

import kotlin.reflect.*


class Service {

    var someProperty: String by ExternalFunctionality()


}

class ExternalFunctionality {

    var backingField = "Default"
    operator fun getValue(service: Service, property: KProperty<*>): String {
        println("getValue called with params: \n" +
                "service: $service\n" +
                "property: ${property.name}"
        )
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, value: String) {
        backingField = value
    }

}
