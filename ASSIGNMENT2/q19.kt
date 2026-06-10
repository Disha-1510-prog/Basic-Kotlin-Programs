import kotlinx.coroutines.*

// 19. Launch: Inside a fun main() = runBlocking {} block, use launch {} to start a background coroutine that prints "Background task finished"[cite: 69].
fun main() = runBlocking {
    launch {
        println("Background task finished")
    }
    Unit
}