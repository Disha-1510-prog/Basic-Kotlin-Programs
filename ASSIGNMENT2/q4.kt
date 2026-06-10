// 4. Super Constructor: Write a parent class Employee(val baseSalary: Int)[cite: 44].
// Write a child class Manager that inherits from Employee and correctly passes 80000 up to the super constructor[cite: 44, 45].
open class Employee(val baseSalary: Int)

class Manager : Employee(80000)