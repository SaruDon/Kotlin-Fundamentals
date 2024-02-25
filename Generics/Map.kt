// Mutable Map representing the number of moons for each planet in the solar system
val solarSystem4 = mutableMapOf(
    "Mercury" to 0,
    "Venus" to 0,
    "Earth" to 1,
    "Mars" to 2,
    "Jupiter" to 79,
    "Saturn" to 82,
    "Uranus" to 27,
    "Neptune" to 14
)

// Main function to demonstrate the usage of the solarSystem4 Map
fun main(){
    // Print the number of moons for the planet "Saturn" using the get function
    print(solarSystem4.get("Saturn"))
}
