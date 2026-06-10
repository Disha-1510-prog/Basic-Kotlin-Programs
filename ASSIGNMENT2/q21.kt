// 21. The Map/Filter Combo [cite: 72]
data class Product(val name: String, val price: Double)

fun main() {
    val inventory = listOf(Product("Laptop", 1000.0), Product("Mouse", 25.0), Product("Keyboard", 60.0))[cite: 73].
    
    // 10% discount means keeping 90% of the price (price * 0.9)
    val discountedExpensiveProducts = inventory
        .map { it.copy(price = it.price * 0.9) } [cite: 74]
        .filter { it.price > 50.0 } [cite: 74]

    println(discountedExpensiveProducts)
}