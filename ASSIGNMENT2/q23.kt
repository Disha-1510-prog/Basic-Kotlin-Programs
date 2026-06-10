import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

// 23. The Concurrent Downloader [cite: 78]
suspend fun fetchUserData(): String {
    delay(1000) [cite: 79]
    return "Alice" [cite: 79]
}

suspend fun fetchAppConfig(): String {
    delay(2000) [cite: 79]
    return "Dark Mode" [cite: 79]
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        // Run concurrently using async
        val userData = async { fetchUserData() } [cite: 80]
        val appConfig = async { fetchAppConfig() } [cite: 80]
        
        // Await both values
        println("User: ${userData.await()}, Config: ${appConfig.await()}") [cite: 81]
    }
    println("Total execution time: $time ms") // Should be ~2000ms, not 3000ms [cite: 81]
}