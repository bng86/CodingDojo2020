package tw.andyang.codingdojo

import junit.framework.Assert.assertEquals
import org.junit.Test

class GameTest {
    @Test
    fun `Andy win, because of 6,6,4,3, another player has 6,6,1,2`() {
        val andyDices = Dices(6,6,4,3)
        val anotherDices = Dices(6,6,1,2)

        assertEquals("Andy win, because of 6,6,4,3", Game(andyDices, anotherDices).getResult())
    }

    @Test
    fun `Andy win, because of 6,6,1,1, another player has 6,6,1,2`() {
        val andyDices = Dices(6,6,1,1)
        val anotherDices = Dices(6,6,1,2)
        assertEquals("Andy win, because of 6,6,1,1", Game(andyDices, anotherDices).getResult())
    }

    @Test
    fun `Another win, because of 6,6,1,1, another player has 6,6,1,2`() {
        val andyDices = Dices(6,6,1,2)
        val anotherDices = Dices(6,6,1,1)
        assertEquals("Another win, because of 6,6,1,1", Game(andyDices, anotherDices).getResult())
    }
}