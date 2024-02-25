// Define a set of rocky planets in the solar system
val rockPlanets2 = setOf<String>("Mercury", "Venus", "Earth", "Mars")

// Define a set of gas giants in the solar system
val gasPlanets2 = setOf<String>("Jupiter", "Saturn", "Uranus", "Neptune")

// Combine both sets to create a set representing all planets in the solar system
val solarSystem2 = rockPlanets2 + gasPlanets2;

// Define a class to represent properties of a cookie
class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

// List of cookies with different properties
val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    // ... (other cookie objects initialized here)
)

// Generate a list of strings representing the full menu with cookie names and prices
val fullMenu = cookies.map {
    "${it.name} - $${it.price}"
}

// Filter soft-baked cookies from the list
val softBaked = cookies.filter { it.softBaked }

// Group cookies based on whether they are soft-baked or not
val groupedMenu = cookies.groupBy { it.softBaked }

// Extract soft-baked and crunchy cookies from the grouped menu
val softBakedMenu = groupedMenu[true] ?: listOf()
val crunchyMenu = groupedMenu[false] ?: listOf()

// Calculate the total price of all cookies using fold
val totalPrice = cookies.fold(0.0) { total, cookie -> total + cookie.price }

// Sort the cookies alphabetically by name
val aphabeticalMenu = cookies.sortedBy { it.name }

// Main function to display information about the cookies
fun main() {
    // Print information about each cookie
    cookies.forEach {
        println("Menu item: ${it.name}")
    }

    // Display the full menu
    println("Full Menu:")
    fullMenu.forEach {
        println(it)
    }

    // Display soft-baked cookies
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    // Display crunchy cookies
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    // Display the total price of all cookies
    println("Total price: $${totalPrice}")

    // Display the menu in alphabetical order
    println("Menu:")
    aphabeticalMenu.forEach() {
        println("Menu: ${it.name}")
    }
}
