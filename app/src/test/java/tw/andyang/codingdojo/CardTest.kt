package tw.andyang.codingdojo

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class CardTest(val input: String, val suit: Suit, val number: Int) {

    @Test
    fun `If input is H2, suit is heart, number is 2` () {
//        Arrange
        val card = Card.create(input)

        assertEquals(card.suit, suit)
        assertEquals(card.number, number)
    }

    companion object {

        @Parameterized.Parameters
        @JvmStatic
        fun getData(): Collection<Array<Any?>> {
            return listOf(
                arrayOf<Any?>(
                    "H1",
                    Suit.Heart,
                    1
                ),
                arrayOf<Any?>(
                    "H3",
                    Suit.Heart,
                    3
                ),
                arrayOf<Any?>(
                    "HJ",
                    Suit.Heart,
                    11
                ),
                arrayOf<Any?>(
                    "HQ",
                    Suit.Heart,
                    12
                ),
                arrayOf<Any?>(
                    "HK",
                    Suit.Heart,
                    13
                ),
                arrayOf<Any?>(
                    "HA",
                    Suit.Heart,
                    1
                ),
                arrayOf<Any?>(
                    "DA",
                    Suit.Diamond,
                    1
                ),
                arrayOf(
                    "CA",
                    Suit.Club,
                    1
                ),
                arrayOf(
                    "SA",
                    Suit.Spades,
                    1
                )
            )
        }
    }
}