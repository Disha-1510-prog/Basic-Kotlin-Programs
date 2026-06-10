// 22. The Exhaustive State Machine [cite: 75]
sealed class ScreenState {
    object Loading : ScreenState()
    data class Success(val data: String) : ScreenState()
    data class Error(val errorMsg: String) : ScreenState() // Expanded state [cite: 76]
}

fun renderUI(state: ScreenState) { [cite: 77]
    // Exhaustive when statement handling all states explicitly
    when (state) { [cite: 77]
        is ScreenState.Loading -> println("Screen is Loading...")
        is ScreenState.Success -> println("Data Loaded Successfully: ${state.data}")
        is ScreenState.Error -> println("Error Occurred: ${state.errorMsg}") [cite: 77]
    }
}