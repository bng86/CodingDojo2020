## tennis game 遊戲需求

This Kata is about implementing a simple tennis game. I came up with it while thinking about Wii tennis, where they have simplified tennis, so each set is one game.

The scoring system is rather simple:

1. Each player can have either of these points in one game 0 15 30 40

2. If you have 40 and you win the ball you win the game, however there are special rules.

3. If both have 40 the players are deuce. a. If the game is in deuce, the winner of a ball will have advantage and game ball. b. If the player with advantage wins the ball he wins the game c. If the player without advantage wins they are back at deuce.

##test case

 player1 = Foo
 player2 = Bar
 
 + score = 0:0 output = 'Love all'
 + score = 1:0 output = 'Fifteen/Love'
 + score = 2:0 output = 'Thirty/Love'
 + score = 3:0 output = 'Forty/Love'
 + score = 4:0 output = 'Foo win'
 + score = 3:3 output = 'Deuce'
 + score = 4:5 output = 'Advantage, Bar'