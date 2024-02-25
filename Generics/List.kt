// List representing rocky planets in the solar system
val rockPlanets1 = listOf<String>("Mercury", "Venus", "Earth", "Mars")

// List representing gas giants in the solar system
val gasPlanets1 = listOf<String>("Jupiter", "Saturn", "Uranus", "Neptune")

// Combined list representing all planets in the solar system by concatenating rockPlanets1 and gasPlanets1
val solarSystem1: List<String> = rockPlanets1 + gasPlanets1;

// Main function to iterate through the solarSystem1 list and print each planet
fun main() {
    // Iterate through the solarSystem1 list and print each planet
    for (planet in solarSystem1) {
        println(planet)
    }
}
