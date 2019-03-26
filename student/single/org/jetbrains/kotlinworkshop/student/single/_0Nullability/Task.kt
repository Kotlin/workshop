package org.jetbrains.kotlinworkshop.student.single._0Nullability

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}

/*
Rewrite Java method 'MessageUtil.sendMessageToClient' in Kotlin in 2-3 lines.
*/
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    TODO()
}