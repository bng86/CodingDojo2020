package tw.andyang.codingdojo

import junit.framework.Assert
import org.junit.Test

class GameTest {

    @Test
    fun 初始化分數為0() {
        val game = Game()
        val score = game.score
        Assert.assertEquals(0, score)
    }
}