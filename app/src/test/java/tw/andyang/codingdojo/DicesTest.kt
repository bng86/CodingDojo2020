package tw.andyang.codingdojo

import org.junit.Assert.assertEquals
import org.junit.Test

class DicesTest {
    @Test
    fun `roll with 1 1 2 3 get 5 point`() {
        assertEquals(5, Dices(1, 1, 2, 3).roll())
    }

    @Test
    fun `Roll with 1 1 1 1 get single one`() {
        assertEquals(Dices.SINGLE_ONE, Dices(1, 1, 1, 1).roll())
    }

    @Test
    fun `Roll with 2 2 2 2 get single two`() {
        assertEquals(Dices.SINGLE_TWO, Dices(2, 2, 2, 2).roll())
    }

    @Test
    fun `Roll with 3 3 3 3 get single three`() {
        assertEquals(Dices.SINGLE_THREE, Dices(3, 3 , 3, 3).roll())
    }

    @Test
    fun `Roll with 4 4 4 4 get single four`() {
        assertEquals(Dices.SINGLE_FOUR, Dices(4, 4 ,4, 4).roll())
    }

    @Test
    fun `Roll with 5 5 5 5 get single five`() {
        assertEquals(Dices.SINGLE_FIVE, Dices(5, 5 ,5, 5).roll())
    }

    @Test
    fun `Roll with 6 6 6 6 get single six`() {
        assertEquals(Dices.SINGLE_SIX, Dices(6, 6 ,6, 6).roll())
    }

    @Test
    fun `Roll with 1 1 6 6 get la18`() {
        assertEquals(Dices.LA18, Dices(1, 1 ,6, 6).roll())
    }

    @Test
    fun `Roll with 1 6 1 6 get la18`() {
        assertEquals(Dices.LA18, Dices(1, 6 ,1, 6).roll())
    }
}