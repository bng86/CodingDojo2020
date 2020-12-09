package tw.andyang.codingdojo

import org.junit.Assert
import org.junit.Test

class FrameTest {

    @Test
    fun `frame first pin 0 second pin 0 is type normal`() {
        val frame = Frame(arrayOf(0, 0))
        val actual = frame.type()
        Assert.assertEquals(FrameType.NORMAL, actual)
    }

    @Test
    fun `frame first pin 1 second pin 2 is type normal`() {
        val frame = Frame(arrayOf(1, 2))
        val actual = frame.type()
        Assert.assertEquals(FrameType.NORMAL, actual)
    }

    @Test
    fun `frame first pin 1 second pin 9 is type spare`() {
        val frame = Frame(arrayOf(1, 9))
        val actual = frame.type()
        Assert.assertEquals(FrameType.SPARE, actual)
    }

    @Test
    fun `frame first pin 3 second pin 7 is type spare`() {
        val frame = Frame(arrayOf(3, 7))
        val actual = frame.type()
        Assert.assertEquals(FrameType.SPARE, actual)
    }


}