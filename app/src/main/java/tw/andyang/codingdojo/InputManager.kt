package tw.andyang.codingdojo

class InputManager {

    fun parse(input: String): Dices {
        val list = input.split(",").map {
            val parseInt = it.toInt()
            if (parseInt !in 1..6) {
                throw IllegalArgumentException()
            }
            parseInt
        }
        return Dices(
            list[0],
            list[1],
            list[2],
            list[3],
        )
    }
}