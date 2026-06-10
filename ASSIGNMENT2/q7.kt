// 7. The Copycat: Instantiate a User from the previous question[cite: 50].
// Write one line of code using .copy() to create a new user with the exact same ID and username, but set isActive to false[cite: 50, 51].
val originalUser = User(1, "Alice", true)
val copiedUser = originalUser.copy(isActive = false)