package tw.andyang.codingdojo

import org.junit.Assert.assertEquals
import org.junit.Test

class RollTest {
    @Test
    fun `roll with 1 1 2 3 get 5 point`() {
        assertEquals(5, Roll(1, 1, 2, 3).getPoint())
    }
}