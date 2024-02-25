val rockPlanets1 = listOf<String>("Mercury", "Venus", "Earth", "Mars")
val gasPlanets1 = listOf<String>("Jupiter", "Saturn", "Uranus", "Neptune")


val solarSystem1:List<String> = rockPlanets1 + gasPlanets1;
fun main(){
    for(planet in solarSystem1){
        println(planet)
    }
}