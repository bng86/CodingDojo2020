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
    @Test
    fun `input is CA,DA,HA,C2,C3 should get ThreeOfAKind` () {
        //CA,DA,H3,C2,H2
        val ph = PokerHand(
            Card.create("CA"),
            Card.create("DA"),
            Card.create("HA"),
            Card.create("C2"),
            Card.create("C3")
        )

        Assert.assertEquals(ph.getType(), PokerHand.Type.ThreeOfAKind)
    }
    @Test
    fun `input is CA,DA,HA,C2,H2 should get FullHouse` () {
        //CA,DA,H3,C2,H2
        val ph = PokerHand(
            Card.create("CA"),
            Card.create("DA"),
            Card.create("HA"),
            Card.create("C2"),
            Card.create("H2")
        )

        Assert.assertEquals(ph.getType(), PokerHand.Type.FullHouse)
    }
    @Test
    fun `input is CA,DA,HA,SA,H2 should get FourOfAKind` () {
        //CA,DA,H3,C2,H2
        val ph = PokerHand(
            Card.create("CA"),
            Card.create("DA"),
            Card.create("HA"),
            Card.create("SA"),
            Card.create("H2")
        )

        Assert.assertEquals(ph.getType(), PokerHand.Type.FourOfAKind)
    }
    @Test
    fun `input is CA,C3,C5,C7,C9 should get Flush` () {
        //CA,C3,C5,C7,C9
        val ph = PokerHand(
            Card.create("CA"),
            Card.create("C3"),
            Card.create("C5"),
            Card.create("C7"),
            Card.create("C9")
        )

        Assert.assertEquals(ph.getType(), PokerHand.Type.Flush)
    }
}