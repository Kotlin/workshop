package org.jetbrains.kotlinworkshop.advanced._8Dsl


class Request(val method: String, val query: String, val contentType: String) {
    operator fun invoke(function: () -> Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class Response(var contents: String, var statusCode: Int) {
    operator fun invoke(function: () -> Unit): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


class RouteHandler(val request: Request, val response: Response) {}


fun get(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f


fun String.with(handler: Response.() -> Unit): Pair<String, Response.() -> Unit> = this to handler


fun main(args: Array<String>) {

    get("/home") {
        if (request.method == "GET") {
            response {

            }
        }
    }


}