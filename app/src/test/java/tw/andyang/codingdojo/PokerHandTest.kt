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

        Assert.assertEquals(ph.getType(), PokerHand.Type.OnePair)

    }

    @Test
    fun `input is CA,DA,H3,C2,H2 should get TwoPair` () {
        //CA,DA,H3,C2,H2
        val ph = PokerHand(
            Card.create("CA"),
            Card.create("DA"),
            Card.create("H3"),
            Card.create("C2"),
            Card.create("H2")
        )

        Assert.assertEquals(ph.getType(), PokerHand.Type.TwoPair)
    }
}