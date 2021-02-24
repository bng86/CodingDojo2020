package tw.andyang.codingdojo

import org.junit.Assert.assertEquals
import org.junit.Test

class CardTest {

    @Test
    fun `If input is H2, suit is heart, number is 2` () {
//        Arrange
        var input = "H2"
        var card = Card(input)

        assertEquals(card.suit, Suit.Heart)
        assertEquals(card.number, 2)    }
}