// 16. Write a Kotlin program to convert temperature: Celsius to Fahrenheit & Fahrenheit to Celsius
fun main() {
    val celsiusValue = 37.0
    val fahrenheitValue = 98.6

    // Celsius to Fahrenheit conversion formula: (C * 9/5) + 32
    val cToF = (celsiusValue * 9 / 5) + 32
    println("$celsiusValue°C is equal to $cToF°F")

    // Fahrenheit to Celsius conversion formula: (F - 32) * 5/9
    val fToC = (fahrenheitValue - 32) * 5 / 9
    println("$fahrenheitValue°F is equal to $fToC°C")
}