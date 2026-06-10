// 4. Write a program to reverse a given number using loops.
fun main() {
    var number = 12345 // Example input
    var reversedNumber = 0
    val original = number

    while (number != 0) {
        val digit = number % 10          // Extract the last digit
        reversedNumber = reversedNumber * 10 + digit // Build the reversed number
        number /= 10                     // Remove the last digit
    }

    println("Original number: $original")
    println("Reversed number: $reversedNumber")
}