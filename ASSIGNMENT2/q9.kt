// 9. Companion Object: Write a class IDGenerator. Inside it, create a companion object with a variable currentId starting at 0, and a function getNextId() that increments and returns it[cite: 53].
class IDGenerator {
    companion object {
        var currentId = 0
        fun getNextId(): Int {
            currentId++
            return currentId
        }
    }
}