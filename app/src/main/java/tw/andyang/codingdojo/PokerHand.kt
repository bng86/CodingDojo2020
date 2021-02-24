package tw.andyang.codingdojo

class PokerHand(card: Card, card2: Card, card3: Card, card4: Card, card5: Card) {

    private val cards = listOf(card, card2, card3, card4, card5)

    fun getType(): Type {
        val numberGroup = cards.groupBy { it.number }
        val pairCount = numberGroup.map { it.value }.count { it.size == 2 }
        if (pairCount == 1) {
            return Type.OnePair
        } else if (pairCount == 2) {
            return Type.TwoPair
        } else {
            TODO()
        }
    }


    enum class Type {
        OnePair, TwoPair
    }
}


