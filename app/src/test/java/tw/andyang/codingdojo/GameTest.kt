package tw.andyang.codingdojo

import junit.framework.Assert
import org.junit.Test

class GameTest {

    @Test
    fun 初始化分數為0() {
        val game = Game()
        val score = game.getScore()
        Assert.assertEquals(0, score)
    }

    @Test
    fun `game with only a frame score`() {
        val frame = Frame(arrayOf(5, 5))
//        val game = Game(listOf(frame))
//        val score = game.getScore()
//        Assert.assertEquals(10, score)
    }
}