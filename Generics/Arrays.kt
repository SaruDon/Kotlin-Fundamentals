// Array representing rocky planets in the solar system
val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")

// Array representing gas giants in the solar system
val gasPlanets = arrayOf<String>("Jupiter", "Saturn", "Uranus", "Neptune")

// Combined array representing all planets in the solar system by concatenating rockPlanets and gasPlanets
val solarSystem: Array<String>  = rockPlanets + gasPlanets;

// Main function to iterate through the solarSystem array and print each planet
fun main() {
    // Iterate through the solarSystem array using indices and print each planet
    for (i in 0 until solarSystem.size) {
        println(solarSystem[i])
    }
}
