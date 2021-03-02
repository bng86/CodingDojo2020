package tw.andyang.codingdojo

import org.junit.Assert.assertEquals
import org.junit.Test

class RollTest {
    @Test
    fun `roll with 1 1 2 3 get 5 point`() {
        assertEquals(5, Roll(1, 1, 2, 3).getPoint())
    }

    @Test
    fun `Roll with 1 1 1 1 get single color`() {
        assertEquals(Roll.SINGLE, Roll(1, 1, 1, 1).getPoint())
    }
}