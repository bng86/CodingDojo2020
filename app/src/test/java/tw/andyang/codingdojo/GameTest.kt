package tw.andyang.codingdojo

import org.junit.Assert
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

    @Test
    fun `10 局完全沒有打倒球坪`() {
        val game = Game(listOf(
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0)
        ))
        val gameScore = game.getScore()
        Assert.assertEquals(0, gameScore)
    }

    @Test(expected = Throwable::class)
    fun `玩了11局`() {
        val game = Game(listOf(
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0),
            Frame(0, 0)
        ))
        val gameScore = game.getScore()
        Assert.assertEquals(0, gameScore)
    }

    @Test
    fun `玩了10局 每局都9分`() {
        val game = Game(listOf(
            Frame(0, 9),
            Frame(0, 9),
            Frame(0, 9),
            Frame(0, 9),
            Frame(0, 9),
            Frame(0, 9),
            Frame(0, 9),
            Frame(0, 9),
            Frame(0, 9),
            Frame(0, 9),
        ))
        val gameScore = game.getScore()
        Assert.assertEquals(90, gameScore)
    }

    @Test
    fun `玩了10局 每局都10分 前後各5分`() {
        val game = Game(listOf(
            Frame(5, 5),
            Frame(5, 5),
            Frame(5, 5),
            Frame(5, 5),
            Frame(5, 5),
            Frame(5, 5),
            Frame(5, 5),
            Frame(5, 5),
            Frame(5, 5),
            Frame(5, 5),
        ))
        val gameScore = game.getScore()
        game.addExtraPins(5)
        Assert.assertEquals(150, gameScore)
    }

    @Test
    fun `第一局打 SPARE，第二局 NORMAL，計算目前分數`() {

        val game = Game(listOf(
            Frame(5, 5),
            Frame(5, 3),
        ))
        val gameScore = game.getScore()
        Assert.assertEquals(23, gameScore)
    }

    @Test
    fun `第一局打 SPARE，第二局 inverse-NORMAL，計算目前分數`() {

        val game = Game(listOf(
            Frame(5, 5),
            Frame(3, 5),
        ))
        val gameScore = game.getScore()
        Assert.assertEquals(21, gameScore)
    }

    @Test
    fun `第一局打 STRIKE，第二局 NORMAL，計算目前分數`() {

        val game = Game(listOf(
            Frame(10),
            Frame(5, 3),
        ))
        val gameScore = game.getScore()
        Assert.assertEquals(26, gameScore)
    }

    @Test
    fun `第一局打 STRIKE，第二局 STRIKE 3rd NORMAL，計算目前分數`() {
        //25 + 18 + 8
        val game = Game(listOf(
            Frame(10),
            Frame(10),
            Frame(5, 3), //Kotlin 1.4
        ))
        val gameScore = game.getScore()
        Assert.assertEquals(51, gameScore)
    }

    @Test
    fun `第一局打 STRIKE，第二局 Spare 3rd NORMAL，計算目前分數`() {
        //20 + 15 + 8
        val game = Game(listOf(
            Frame(10),
            Frame(5, 5),
            Frame(5, 3), //Kotlin 1.4
        ))
        val gameScore = game.getScore()
        Assert.assertEquals(43, gameScore)
    }
}