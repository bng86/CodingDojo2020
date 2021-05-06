package tw.andyang.codingdojo

import kotlin.math.abs

data class Game(val player1: Player, val player2: Player) {
    companion object {
        const val FIFTEEN = "Fifteen"
        const val THIRTY = "Thirty"
        const val FORTY = "Forty"
        const val DEUCE = "Deuce"
        const val ALL = "All"
        const val LOVE = "Love"
        const val ADVANTAGE = "Advantage"
        const val WIN = "Win"
        const val SCORE_1 = 1
        const val SCORE_2 = 2
        const val SCORE_3 = 3

    }

    fun judge(): String {
        return when {
            isDeuce() -> DEUCE
            isSameScore() -> "${player1.score.toTerm()} $ALL"
            !isGamePoint() -> {
                // player1 score != player2 score
                "${player1.score.toTerm()}/${player2.score.toTerm()}"
            }
            isAdvantage() -> {
                "$ADVANTAGE, ${getAdvantageName()}"
            }
            else -> {
                "${getAdvantageName()} $WIN"
            }
        }
    }

    private fun isSameScore(): Boolean = player1.score == player2.score

    private fun isDeuce() = isSameScore() and (player1.score >= SCORE_3)

    private fun isAdvantage() = abs(player1.score - player2.score) == 1

    private fun isGamePoint() = player1.score > SCORE_3 || player2.score > SCORE_3

    private fun getAdvantageName() =
        if (player1.score > player2.score) player1.name else player2.name


    private fun Int.toTerm() :String = scoreMap[this].orEmpty()

    private val scoreMap: Map<Int, String> = mapOf(
        0 to LOVE,
        1 to FIFTEEN,
        2 to THIRTY,
        3 to FORTY
    )
}
