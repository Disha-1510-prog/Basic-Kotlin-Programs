// 15. Write a program to generate the Fibonacci series up to N terms using loops.
fun main() {
    val n = 10 // Number of terms to generate
    var t1 = 0
    var t2 = 1

    println("Fibonacci Series up to $n terms:")

    for (i in 1..n) {
        print("$t1  ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}