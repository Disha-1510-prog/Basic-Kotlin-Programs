// 5. Write a Kotlin program to check whether a number is a palindrome or not.
fun main() {
    var number = 121 // Example input
    var reversedNumber = 0
    val originalNumber = number

    // Reverse the number first
    while (number > 0) {
        val digit = number % 10
        reversedNumber = reversedNumber * 10 + digit
        number /= 10
    }

    // Check if original matches reversed
    if (originalNumber == reversedNumber) {
        println("$originalNumber is a Palindrome")
    } else {
        println("$originalNumber is not a Palindrome")
    }
}