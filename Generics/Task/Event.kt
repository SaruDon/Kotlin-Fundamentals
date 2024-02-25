// Data class representing an event with details like title, description, daypart, and duration
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

// Enum class representing different parts of the day
enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

// Class representing work-related events
class Work {
    // Example events with different details
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    // List of all events
    var eventList = listOf(event1, event2, event3, event4, event5, event6)

    // Group events based on whether their duration is less than 60 minutes
    var eventGrp = eventList.groupBy { it.durationInMinutes < 60 }

    // Group events based on the daypart
    var morning = eventList.groupBy { it.daypart == Daypart.MORNING }
    var grpEvents = eventList.groupBy { it.daypart }
}

// Main function to demonstrate the Work class and print information about events
fun main() {
    // Iterate through the list of events and print their titles
    for (event in Work().eventList) {
        println("Event name: ${event.title}")
    }

    // Display information about short events
    println("Short events:")
    println("You have: ${Work().eventGrp.size} short events")
    
    // Iterate through grouped events by daypart and print the count of events for each daypart
    Work().grpEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }
}
