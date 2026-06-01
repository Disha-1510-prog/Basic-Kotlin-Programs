// 14. Write a Kotlin program to print all prime numbers from 1 to N.
fun main() {
    val n = 30 // Example input range limit
    println("Prime numbers between 1 and $n are:")

    for (num in 2..n) {
        var isPrime = true
        for (i in 2..num / 2) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            print("$num ")
        }
    }
}