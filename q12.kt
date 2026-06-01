// 11. Write a Kotlin program to find the sum of digits of a number.
fun main() {
    var number = 1234 // Example input (1 + 2 + 3 + 4 = 10)
    var sum = 0
    val original = number

    while (number > 0) {
        sum += number % 10 // Add the last digit to sum
        number /= 10       // Drop the last digit
    }

    println("The sum of digits of $original is: $sum")
}