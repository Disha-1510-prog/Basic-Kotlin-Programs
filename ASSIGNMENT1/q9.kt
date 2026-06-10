// 9. Write a Kotlin program to print the multiplication table of a given number.
fun main() {
    val number = 7 // Example input

    println("Multiplication Table of $number:")
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}