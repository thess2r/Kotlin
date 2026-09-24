fun main() {
    println(printWeather("Oral", 10, 40, 10))
}

fun printWeather(
    city: String,
    lowTemperature: Int,
    highTemperature: Int,
    chanceOfRain: Int
): String {
    return "City: $city\nLow temperature: $lowTemperature, High temperature: $highTemperature\nChance of rain: $chanceOfRain%"
}