fun main(){
    /*
        In Kotlin, there's a distinction between nullable and non-nullable types:
            Nullable types are variables that can hold null.
            Non-null types are variables that can't hold null.

    */

    // error();
    nullability();
    /*
    error function is of Non - null tyre of varibale
    where nullability us of Nullable of varibale    
     */



    /*
    2)
        The ?. safe-call operator allows safer access to nullable variables because the Kotlin
         compiler stops any attempt of member access to null references and returns null for the
         member accessed.
     */
    nullabilitySafeCall()
    // errorNullabilitySafeCall()


    /*
    3)
        Use the !! not-null assertion operator 
        used in exception handeling for varibale not to be null
        errorNotNull() Gives null pointer exception
    */
    errorNotNull()
    notNull()


    /*
    4)
    Can be used with if else
    */
    lengthOfVal()



    /*
    5)
    Use the ?: Elvis operator

    val lengthOfName = favoriteActor?.length ?: 0
                                                Default value

    */
    lengthOfVal()
}

// fun errorNullability(){
//     var name :String ="Ranbir kappor"
//     println(name)
//     name = null
//     println(name)
// }


fun nullability(){
    var name :String ?="Ranbir kappor"
    println(name)
    name = null
    println(name)
}


fun nullabilitySafeCall(){
    var name :String ?="Ranbir kappor"
    println(name?.length)
    name = null
    println(name)
}

// fun errorNullabilitySafeCall(){
//     var name :String ?="null"
//     println(name.length)
// }


fun errorNotNull(){
    var favoriteActor: String? = null
    println(favoriteActor!!.length)
}
fun notNull(){
    var favoriteActor: String? = "Sarvesh"
    println(favoriteActor!!.length)
}

fun lengthOfVal(){
    var favoriteActor: String? = "Sandra Oh"
     
     val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
        } else {
           0
        }
     print(lengthOfName)
}


fun lenthElvis(){
    var favoriteActor: String? = "Ranbir Kapoor"
    var lengthStr: Int  = favoriteActor?.length ?: 0

    println(lengthStr)
}