fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    
    val noti = printNotificationSummary(morningNotification)
    noti()
    println()
    val notiEvening = printNotificationSummary(eveningNotification)
    notiEvening()
    
}


fun printNotificationSummary(numberOfMessages: Int): () -> Unit= {
    when(numberOfMessages){
        in 1..99 -> println("message $numberOfMessages")
        else -> println("message 99+")
    }
}