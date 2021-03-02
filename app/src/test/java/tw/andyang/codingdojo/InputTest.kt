package tw.andyang.codingdojo

import org.junit.Assert.assertEquals
import org.junit.Test

class InputTest {

    @Test
    fun `Input 1,1,2,3 output is Dice 1 1 2 3 `() {
        val input = "1,1,2,3"
        val output = InputManager().parse(input)
        assertEquals(Dices(1, 1, 2, 3), output)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `Input 1,1,2,8 output is 1 1 2 3 `() {
        val input = "1,1,2,8"
        InputManager().parse(input)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `Input 1,1,2,acb output is 1 1 2 3 `() {
        val input = "1,1,2,acb"
        InputManager().parse(input)
    }

}