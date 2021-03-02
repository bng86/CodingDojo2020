package tw.andyang.codingdojo

import org.junit.Assert.assertEquals
import org.junit.Test

class InputTest {

    @Test
    fun `Input 1,1,2,3 output is 1 1 2 3 `() {
        val input = "1,1,2,3"
        val output = InputManager().parse(input)
        assertEquals(listOf(1, 1, 2, 3), output)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `Input 1,1,2,8 output is 1 1 2 3 `() {
        val input = "1,1,2,8"
        val output = InputManager().parse(input)
    }

}