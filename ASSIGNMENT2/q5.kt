// 5. Abstraction: Write an abstract class Animal with an abstract method makeSound()[cite: 46].
// Write a Cat class that inherits from it and implements the sound[cite: 46, 47].
abstract class Animal {
    abstract fun makeSound()
}

class Cat : Animal() {
    override fun makeSound() {
        println("Meow")
    }
}