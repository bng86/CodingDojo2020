package tw.andyang.codingdojo

import org.junit.Assert.assertEquals
import org.junit.Test

class CardTest {

    @Test
    fun `If input is H2, suit is heart, number is 2` () {
//        Arrange
        val input = "H2"
        val card = Card.create(input)

        assertEquals(card.suit, Suit.Heart)
        assertEquals(card.number, 2)
    }

    @Test
    fun `If input is H3, suit is heart, number is 3` () {
//        Arrange
        val input = "H3"
        val card = Card.create(input)

        assertEquals(card.suit, Suit.Heart)
        assertEquals(card.number, 3)
    }

    @Test
    fun `If input is HJ, suit is heart, number is 11` () {
//        Arrange
        val input = "HJ"
        val card = Card.create(input)

        assertEquals(card.suit, Suit.Heart)
        assertEquals(card.number, 11)
    }

    @Test
    fun `If input is HQ, suit is heart, number is 12` () {
//        Arrange
        val input = "HQ"
        val card = Card.create(input)

        assertEquals(card.suit, Suit.Heart)
        assertEquals(card.number, 12)
    }

    @Test
    fun `If input is HK, suit is heart, number is 13` () {
//        Arrange
        val input = "HK"
        val card = Card.create(input)

        assertEquals(card.suit, Suit.Heart)
        assertEquals(card.number, 13)
    }
}