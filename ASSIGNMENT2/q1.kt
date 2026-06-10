// 1. Encapsulation: Write a class BankAccount with a private var balance: Double[cite: 38]. 
// Provide a public function deposit(amount: Double) that safely adds to the balance[cite: 38, 39].
class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }
    
    fun getBalance(): Double = balance
}