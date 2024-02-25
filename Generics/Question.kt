// Data class representing a quiz question
data class Question<T>(
    val questionText: String,
    val ans: T,
    val difficulty: Difficulty
)

// Enum class representing the difficulty levels of quiz questions
enum class Difficulty {
    Easy, Medium, Hard
}

// Class representing a Quiz with questions of different types and difficulty levels
class Quiz {
    // Questions with different types of answers and difficulty levels
    val q1 = Question<String>("My name is Sarvesh", "is", Difficulty.Easy)
    val q2 = Question<Boolean>("Sky is green", false, Difficulty.Medium)
    val q3 = Question<String>("One dozen is", "12", Difficulty.Hard) // Corrected the type of the answer

    // Companion object to store student progress
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 2
    }

    // Function to print the quiz questions and their details
    fun printQuiz() {
        println(q1.questionText)
        println(q1.ans)
        println(q1.difficulty)
        println()
        println(q2.questionText)
        println(q2.ans)
        println(q2.difficulty)
        println()
        println(q3.questionText)
        println(q3.ans)
        println(q3.difficulty)
        println()
    }
}

// Extension property to calculate and get the progress text
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"

// Extension function to print a progress bar based on student progress
fun Quiz.StudentProgress.printProgressBar() {
    repeat(answered) { print("X") }
    repeat(total - answered) { print("0") }
    println()
    println(progressText)
}

// Main function to demonstrate the Quiz class
fun main() {
    val quiz = Quiz()
    quiz.printQuiz()
}
