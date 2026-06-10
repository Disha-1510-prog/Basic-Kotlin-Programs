// 7. Write a Kotlin function to find the largest among three numbers.
fun findLargest(num1: Int, num2: Int, num3: Int): Int {
    return if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }
}

fun main() {
    val a = 25
    val b = 78
    val c = 43
    val largest = findLargest(a, b, c)
    println("The largest number among $a, $b, and $c is: $largest")
}