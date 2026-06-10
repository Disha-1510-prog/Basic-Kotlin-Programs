import kotlinx.coroutines.*

// 20. Async: Inside a runBlocking block, write code using async {} to calculate 5+5 and then use .await() to print the result[cite: 70].
fun main() = runBlocking {
    val deferredResult = async { 5 + 5 }
    println(deferredResult.await())
}