class Song(val title:String,val publishYear: String, val playCount:Int){
    fun popular(): ()-> Unit {
        return if(playCount>1000){
           { println("Is popular")}
        }else{
            {println("Unpopular")}
        }
    }
}

fun main(){
    val s:Song = Song("Lover","24 March",2000)
    var popularityFun = s.popular()
    popularityFun()
}