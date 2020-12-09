package tw.andyang.codingdojo

import junit.framework.Assert
import org.junit.Test

class GameTest {

    @Test
    fun 初始化分數為0() {
        val game = Game(listOf())
        val score = game.getScore()
        Assert.assertEquals(0, score)
    }

    @Test
    fun `game with only a frame expect score equals that frame score`() {
        val frame = Frame(5, 5)
        val frameScore = frame.score()
        Assert.assertEquals(10, frameScore)
        val game = Game(listOf(frame))
        val gameScore = game.getScore()
        Assert.assertEquals(frameScore, gameScore)
    }
}