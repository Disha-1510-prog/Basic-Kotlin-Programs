// 10. Sealed Class: Write a sealed class ScreenState. Add an object Loading and a data class Success(val data: String) that inherit from it[cite: 54].
sealed class ScreenState {
    object Loading : ScreenState()
    data class Success(val data: String) : ScreenState()
}