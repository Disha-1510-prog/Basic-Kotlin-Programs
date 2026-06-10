import kotlinx.coroutines.*

// 1. Data Class [cite: 93, 94]
data class CartItem(val name: String, val price: Double, val quantity: Int) [cite: 94]

// 2. Extension Function [cite: 93, 95]
fun List<CartItem>.calculateTotal(): Double { [cite: 95]
    return this.sumOf { it.price * it.quantity } [cite: 95]
}

// 3. Sealed Class [cite: 93, 96]
sealed class CheckoutResult { [cite: 96]
    object Processing : CheckoutResult() [cite: 96]
    data class Success(val receiptId: String) : CheckoutResult() [cite: 96]
    data class Failed(val reason: String) : CheckoutResult() [cite: 96]
}

// 4. Singleton Object with Suspend Pipeline [cite: 93, 97]
object PaymentProcessor { [cite: 97]
    suspend fun processPayment(cart: List<CartItem>): CheckoutResult { [cite: 97]
        delay(2000) // Simulating business network call delay [cite: 98]
        val total = cart.calculateTotal() [cite: 99]
        
        return if (total > 1000.0) { [cite: 100]
            CheckoutResult.Failed("Insufficient funds for large transaction") [cite: 100]
        } else {
            CheckoutResult.Success("TXN-${(1000..9999).random()}") [cite: 101]
        }
    }
}

// 5. Main execution using runBlocking and concurrent pipelines [cite: 103]
fun main() = runBlocking {
    // Creating two separate test carts [cite: 103]
    val cheapCart = listOf(
        CartItem("Mouse", 25.0, 2),
        CartItem("Keyboard", 60.0, 1)
    )
    
    val expensiveCart = listOf(
        CartItem("Laptop", 1200.0, 1),
        CartItem("Monitor", 300.0, 1)
    )

    // Launch both executions concurrently via individual coroutines [cite: 104]
    launch {
        println("Processing Cheap Cart...")
        val result = PaymentProcessor.processPayment(cheapCart)
        // Exhaustive when block evaluation [cite: 105]
        when (result) { [cite: 105]
            is CheckoutResult.Processing -> println("Cheap Cart status: Processing")
            is CheckoutResult.Success -> println("Cheap Cart Success! Receipt ID: ${result.receiptId}") [cite: 105]
            is CheckoutResult.Failed -> println("Cheap Cart Failed! Reason: ${result.reason}") [cite: 105]
        }
    }

    launch {
        println("Processing Expensive Cart...")
        val result = PaymentProcessor.processPayment(expensiveCart)
        // Exhaustive when block evaluation [cite: 105]
        when (result) { [cite: 105]
            is CheckoutResult.Processing -> println("Expensive Cart status: Processing")
            is CheckoutResult.Success -> println("Expensive Cart Success! Receipt ID: ${result.receiptId}") [cite: 105]
            is CheckoutResult.Failed -> println("Expensive Cart Failed! Reason: ${result.reason}") [cite: 105]
        }
    }
    Unit
}