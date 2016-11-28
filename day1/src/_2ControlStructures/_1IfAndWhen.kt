package whenAsExpression

import whenAsExpression.Color.*

enum class Color {
    BLUE, ORANGE, RED
}

fun updateWeather(
        celsiusDegrees: Double
) {
    val description: String
    val color: Color
    when {
        celsiusDegrees < 0 -> {
            description = "cold"
            color = BLUE
        }
        celsiusDegrees in 0..15 -> {
            description = "mild"
            color = ORANGE
        }
        else -> {
            description = "hot"
            color = RED
        }
    }
}

fun updateWeather1(celsiusDegrees: Double) {
    val (description, color) =
            when {
        celsiusDegrees < 0 -> Pair("cold", BLUE)
        celsiusDegrees in 0..15 -> "mild" to ORANGE
        else -> "hot" to RED
    }
}