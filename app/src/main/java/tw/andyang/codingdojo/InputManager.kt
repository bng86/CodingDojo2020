package tw.andyang.codingdojo

class InputManager {

    fun parse(input: String): List<Int> {
        return input.split(",").map {
            val parseInt = it.toInt()
            if (parseInt !in 1..6) {
                throw IllegalArgumentException()
            }
            parseInt
        }
    }
}