// 24. The Builder Pattern (Scope Functions) [cite: 82]
class File {
    var filename: String = ""
    var permissions: String = ""
}

fun buildFile(filename: String): File { [cite: 83]
    return File().apply {
        this.filename = filename
        permissions = "Read/Write" // Setting file permissions using apply [cite: 84]
    }.also {
        println("File ${it.filename} created") // Logging metadata action using also [cite: 85]
    }
}