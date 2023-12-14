fun main() {    
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    
    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name : $name")
        println("Age : $age")
        printHooby(hobby)?.invoke()
        printreferrer(referrer)?.invoke()
    }
    
    fun printreferrer (referrer:Person?) : (() -> Unit)? {
        return if(referrer!=null){
            {
                print("He has Has a referrer named $referrer, who likes to play tennis.")
            }
        }else{
            {
                print("Does Not have referrer")
            }
        }
    }

    fun printHooby (hobby:String?) : (() -> Unit)? {
        return if(hobby!=null){
            {
                println("Likes to $hobby")
            }
        }else{
            {
                print("")
            }
        }
    }
    
}