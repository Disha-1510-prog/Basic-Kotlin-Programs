// 2. Write a program to check whether a given number is even or odd.
fun main() {
    val number = 15 // Change this value to test different numbers
    
    // If a number is perfectly divisible by 2, it is even; otherwise, it is odd
    if (number % 2 == 0) {
        println("$number is Even")
    } else {
        println("$number is Odd")
    }
}