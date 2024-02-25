val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
val gasPlanets = arrayOf<String>("Jupiter", "Saturn", "Uranus", "Neptune")


val solarSystem:Array<String>  = rockPlanets + gasPlanets;
fun main(){
    for(i in 0..solarSystem.size-1){
        println(solarSystem[i])
    }
}