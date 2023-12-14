fun main() {
    val celsiusTofahrenheit:(Double) -> Double = {c -> (9/5)*c +32}
    val kelvinToCelsius:(Double) -> Double = {k -> k -273.15}
    val fahrenheitToKelvin:(Double) -> Double = {f -> 5/9*(f-32) +273.15}

    printFinalTemperature(27.0, "Celcius", "Fahrenheit",celsiusTofahrenheit) 
    printFinalTemperature(350.0, "Kelvin", "Celcius",kelvinToCelsius) 
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin",fahrenheitToKelvin)
}


fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}