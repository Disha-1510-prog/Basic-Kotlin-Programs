// 3. Inheritance: Create an open class Vehicle with a function startEngine()[cite: 42].
// Create a Motorcycle subclass that inherits from it and overrides startEngine() to print "Vroom!"[cite: 42, 43].
open class Vehicle {
    open fun startEngine() {
        println("Engine started")
    }
}

class Motorcycle : Vehicle() {
    override fun startEngine() {
        println("Vroom!")
    }
}