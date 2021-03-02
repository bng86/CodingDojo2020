package tw.andyang.codingdojo

class Game(private val onePlayerDices: Dices, private val anotherDices: Dices) {
    fun getResult(): String {
        val winnerDices = onePlayerDices
        return "Andy win, because of $onePlayerDices"
    }
}
