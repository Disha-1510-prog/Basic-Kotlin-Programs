// 12. Higher-Order Function: Write a function executeTwice(action: () -> Unit) that simply calls the passed-in action lambda two times in a row[cite: 58].
fun executeTwice(action: () -> Unit) {
    action()
    action()
}