fun main() {
    // val trickFunction = treat
    // trickFunction()

    val istrick = trickOrTreat(true, true)
    istrick()
}

val treat: ()-> Unit ={
    print("helloo")
}

val add: (a: Int, b: Int)-> Int = {
    a, b -> a + b
}



fun trickOrTreat(istrick: Boolean, trick: Boolean): () -> Unit {
    return if (trick) {
        {
            println("message trick")
        }
    } else {
        {
            println("message treat")
        }
    }
}


// fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
//     if (isTrick) {
//         return trick
//     } else {
//         println(extraTreat(5))
//         return treat
//     }
// }



