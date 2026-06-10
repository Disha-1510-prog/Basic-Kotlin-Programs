import kotlinx.coroutines.delay

// 18. Suspend: Write a suspend fun fetchWeather(): String that uses delay() to wait 1000ms, then returns "Sunny"[cite: 68].
suspend fun fetchWeather(): String {
    delay(1000)
    return "Sunny"
}