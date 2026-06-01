// 13. Write a Kotlin function to calculate simple interest using input values.
fun calculateSimpleInterest(principal: Double, rate: Double, time: Double): Double {
    // Formula: (P * R * T) / 100
    return (principal * rate * time) / 100
}

fun main() {
    val principal = 5000.0
    val rate = 7.5
    val time = 3.0 // dynamically defined inputs
    
    val si = calculateSimpleInterest(principal, rate, time)
    println("Principal: $$principal, Rate: $rate%, Time: $time years")
    println("Calculated Simple Interest: $$si")
}