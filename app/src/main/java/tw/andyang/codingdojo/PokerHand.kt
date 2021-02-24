package tw.andyang.codingdojo

class PokerHand(card: Card, card2: Card, card3: Card, card4: Card, card5: Card) {

    private val cards = listOf(card, card2, card3, card4, card5)

    fun getType(): Type {
        val numberGroup = cards.groupBy { it.number }
        val pairCount = numberGroup.map { it.value }.count { it.size == 2 }
        val threeCount = numberGroup.map { it.value }.count { it.size == 3 }
        val fourCount = numberGroup.map { it.value }.count { it.size == 4 }
        val flushCount = cards.groupBy { it.suit }.map { it.value }.count { it.size == 5 }
        val sortedCards = cards.map { it.number }.sortedDescending()
        val isStraight = (sortedCards.first() + sortedCards.last()) * sortedCards.size == 2 * sortedCards.sum()

        return when {
            isStraight -> {
                Type.Straight
            }
            flushCount == 1 -> {
                Type.Flush
            }
            fourCount == 1 -> {
                Type.FourOfAKind
            }
            pairCount == 1 && threeCount == 1 -> {
                Type.FullHouse
            }
            threeCount == 1 -> {
                Type.ThreeOfAKind
            }
            pairCount == 2 -> {
                Type.TwoPair
            }
            pairCount == 1 -> {
                Type.OnePair
            }
            else -> {
                TODO()
            }
        }
    }


    enum class Type {
        OnePair, TwoPair,
        ThreeOfAKind, FullHouse, FourOfAKind, Flush, Straight
    }
}


