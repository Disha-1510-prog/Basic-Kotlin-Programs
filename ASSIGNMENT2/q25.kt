// 25. Polymorphic HOF [cite: 86]
abstract class Shape { [cite: 87]
    abstract fun calculateArea(): Double [cite: 87]
}

class Circle(val radius: Double) : Shape() {
    override fun calculateArea(): Double = Math.PI * radius * radius
}

class Square(val side: Double) : Shape() {
    override fun calculateArea(): Double = side * side
}

// Higher-Order Function taking a list of abstract types and an execution block
fun processShapes(shapes: List<Shape>, action: (Double) -> Unit) { [cite: 88]
    for (shape in shapes) { [cite: 89]
        action(shape.calculateArea()) [cite: 89]
    }
}