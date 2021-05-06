package tw.andyang.codingdojo

import org.junit.Assert.assertEquals
import org.junit.Test

class GameTest {

    @Test
    fun given_player_Andy_score_0() {
        val player1 = Player(0, "Andy")

        assertEquals("Andy", player1.name)
        assertEquals(0, player1.score)
    }

    @Test
    fun given_game_with_player_andy_score0_and_John_0_output_Love_all() {
        val player1 = Player(0, "Andy")
        val player2 = Player(0, "John")

        val game = Game(
            player1, player2
        )

        assertEquals(player1.copy(), game.player1)
        assertEquals(player2.copy(), game.player2)
        val result = game.judge()
        assertEquals("Love All", result)
    }

    @Test
    fun game_1_0_with_player_Andy_and_player_John_output_Fifteen_Love() {
        val player1 = Player(1, "Andy")
        val player2 = Player(0, "John")

        val game = Game(
            player1,
            player2
        )
//        game.win(player1)
        val result = game.judge()
        assertEquals("Fifteen/Love", result)
    }

    @Test
    fun game_1_1_with_player_Andy_and_player_John_output_Fifteen_All() {
        val player1 = Player(1, "Andy")
        val player2 = Player(1, "John")

        val game = Game(
            player1,
            player2
        )

        val result = game.judge()
        assertEquals("Fifteen All", result)
    }

    @Test
    fun game_2_2_with_player_Andy_and_player_John_output_Thirty_All() {
        val player1 = Player(2, "Andy")
        val player2 = Player(2, "John")

        val game = Game(
            player1,
            player2
        )

        val result = game.judge()
        assertEquals("Thirty All", result)
    }

    @Test
    fun game_3_3_with_player_Andy_and_player_John_output_Deuce() {
        val player1 = Player(3, "Andy")
        val player2 = Player(3, "John")

        val game = Game(
            player1,
            player2
        )

        val result = game.judge()
        assertEquals("Deuce", result)
    }

    @Test
    fun game_4_4_with_player_Andy_and_player_John_output_Deuce() {
        val player1 = Player(4, "Andy")
        val player2 = Player(4, "John")

        val game = Game(
            player1,
            player2
        )

        val result = game.judge()
        assertEquals("Deuce", result)
    }

    @Test
    fun game_2_0_with_player_Andy_and_player_John_output_Thirty_Love() {
        val player1 = Player(2, "Andy")
        val player2 = Player(0, "John")

        val game = Game(
            player1,
            player2
        )

        val result = game.judge()
        assertEquals("Thirty/Love", result)
    }

    @Test
    fun game_3_0_with_player_Andy_and_player_John_output_Forty_Love() {
        val player1 = Player(3, "Andy")
        val player2 = Player(0, "John")

        val game = Game(
            player1,
            player2
        )

        val result = game.judge()
        assertEquals("Forty/Love", result)
    }

    @Test
    fun game_3_4_with_player_Andy_and_player_John_output_Advantage_John() {
        val player1 = Player(3, "Andy")
        val player2 = Player(4, "John")

        val game = Game(
            player1,
            player2
        )

        val result = game.judge()
        assertEquals("Advantage, John", result)
    }

    @Test
    fun game_4_3_with_player_Andy_and_player_John_output_Advantage_Andy() {
        val player1 = Player(4, "Andy")
        val player2 = Player(3, "John")

        val game = Game(
            player1,
            player2
        )

        val result = game.judge()
        assertEquals("Advantage, Andy", result)
    }

    @Test
    fun game_5_3_with_player_Andy_and_player_John_output_Andy_Win() {
        val player1 = Player(5, "Andy")
        val player2 = Player(3, "John")

        val game = Game(
            player1,
            player2
        )

        val result = game.judge()
        assertEquals("Andy Win", result)
    }

    @Test
    fun game_3_5_with_player_Andy_and_player_John_output_John_Win() {
        val player1 = Player(3, "Andy")
        val player2 = Player(5, "John")

        val game = Game(
            player1,
            player2
        )

        val result = game.judge()
        assertEquals("John Win", result)
    }
}