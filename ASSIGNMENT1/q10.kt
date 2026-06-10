// 10. Write a function to check whether a character is a vowel or consonant.
fun checkCharType(ch: Char) {
    // Convert character to lowercase to easily handle both cases
    val lowerCh = ch.toLowerCase()

    if (lowerCh in 'a'..'z') {
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            println("$ch is a Vowel")
        } else {
            println("$ch is a Consonant")
        }
    } else {
        println("$ch is not a valid alphabet letter")
    }
}

fun main() {
    checkCharType('E')
    checkCharType('x')
}