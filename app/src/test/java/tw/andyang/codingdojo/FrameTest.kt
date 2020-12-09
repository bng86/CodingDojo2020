package tw.andyang.codingdojo

import org.junit.Assert
import org.junit.Test
import org.junit.internal.runners.statements.ExpectException
import java.lang.IllegalStateException

class FrameTest {

    @Test
    fun `frame first pin 0 second pin 0 is type normal`() {
        val frame = Frame(0, 0)
        val actual = frame.type()
        Assert.assertEquals(FrameType.NORMAL, actual)
    }

    @Test
    fun `frame first pin 1 second pin 2 is type normal`() {
        val frame = Frame(1, 2)
        val actual = frame.type()
        Assert.assertEquals(FrameType.NORMAL, actual)
    }

    @Test
    fun `frame first pin 1 second pin 9 is type spare`() {
        val frame = Frame(1, 9)
        val actual = frame.type()
        Assert.assertEquals(FrameType.SPARE, actual)
    }

    @Test
    fun `frame first pin 3 second pin 7 is type spare`() {
        val frame = Frame(3, 7)
        val actual = frame.type()
        Assert.assertEquals(FrameType.SPARE, actual)
    }

    @Test(expected = IllegalStateException::class)
    fun `frame first pin 10 second pin 0 throws Exception`() {
        val frame = Frame(10, 0)
        val actual = frame.type()
    }

    @Test
    fun `frame first pin 0 second pin 10 is type spare`() {
        val frame = Frame(0, 10)
        val actual = frame.type()
        Assert.assertEquals(FrameType.SPARE, actual)
    }

    @Test
    fun `frame first pin 0 second pin 0 score 0`() {
        val frame = Frame(0, 0)
        val actual = frame.score()
        Assert.assertEquals(0, actual)
    }

    @Test
    fun `frame first pin 1 second pin 2 score 3`() {
        val frame = Frame(1, 2)
        val actual = frame.score()
        Assert.assertEquals(3, actual)
    }

    @Test
    fun `frame first pin 10  score 10`() {
        val frame = Frame(10)
        val actual = frame.score()
        Assert.assertEquals(10, actual)
    }

    @Test
    fun `frame first pin 1 second pin 9 score 10`() {
        val frame = Frame(1, 9)
        val actual = frame.score()
        Assert.assertEquals(10, actual)
    }

    @Test(expected = IllegalStateException::class)
    fun `frame first pin 3 second pin 9 throw Exception`() {
        val frame = Frame(3, 9)
        val actual = frame.score()
    }
}