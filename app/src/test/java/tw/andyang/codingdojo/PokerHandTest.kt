package tw.andyang.codingdojo

import org.junit.Assert
import org.junit.Test

class PokerHandTest {
    @Test
    fun `if one pair return one pair`() {
        //Given PokerHand
        val ph = PokerHand(
            Card.create("CA"),
            Card.create("DA"),
            Card.create("H3"),
            Card.create("C4"),
            Card.create("H5")
        )

        Assert.assertEquals(ph.getType(), "OnePair")

    }

}