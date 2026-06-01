// 6. Write a program to find the factorial of a number using a loop.
fun main() {
    val number = 5 // Example input (5! = 5 * 4 * 3 * 2 * 1)
    var factorial: Long = 1

    for (i in 1..number) {
        factorial *= i
    }

    println("Factorial of $number is $factorial")
}