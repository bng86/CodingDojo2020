package tw.andyang.codingdojo

class Game(private val onePlayerDices: Dices, private val anotherDices: Dices) {
    fun getResult(): String {
        val diff = onePlayerDices.roll() < anotherDices.roll()
        return when
        {
            (diff) ->  "Another win, because of $anotherDices"
            else -> "Andy win, because of $onePlayerDices"
        }
    }
}
