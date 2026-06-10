// 16. Apply: Create a standard class Window with var width = 0 and var height = 0. Instantiate it and chain an apply { } block to set both dimensions to 1920 and 1080 immediately[cite: 65].
class Window {
    var width = 0
    var height = 0
}

val myWindow = Window().apply {
    width = 1920
    height = 1080
}