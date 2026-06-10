// 2. Custom Setter: Write a class Thermostat with a var temperature: Double[cite: 40].
// Give it a private set so it can only be modified from within the class[cite: 40, 41].
class Thermostat(temperature: Double) {
    var temperature: Double = temperature
        private set // Prevents external modification
}