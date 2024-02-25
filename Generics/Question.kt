data class Question<T>(
    val questionText: String,
    val ans: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    Easy, Medium, Hard
}

class Quiz {
    val q1 = Question<String>("My name is Sarvesh", "is", Difficulty.Easy)
    val q2 = Question<Boolean>("Sky is green", false, Difficulty.Medium)
    val q3 = Question<String>("One dozen is", "28", Difficulty.Hard) // Corrected the type of the answer

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 2
    }
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

val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"

fun Quiz.StudentProgress.printProgressBar() {
    repeat(answered) { print("X") }
    repeat(total - answered) { print("0") }
    println()
    println(progressText)
}


fun main() {
    val quiz = Quiz()
    quiz.printQuiz()
}
