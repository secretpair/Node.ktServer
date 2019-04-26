external fun require(module:String):dynamic

fun main(args: Array<String>) {
    println("Hello JavaScript!")

    val express = require("express")
    val app = express()

    //수정사항
    app.get("/") { req, res ->
        res.type("text/plain")
        res.send("I am a beautiful butterfly.")
    }

    app.listen(3000) {
        println("Listening on port 3000")
    }
}

