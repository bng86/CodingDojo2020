package tw.andyang.codingdojo

import java.lang.Exception
import java.lang.IllegalArgumentException

class Card(val number: Int = 2, val suit: Suit) {



    companion object {
        fun create(input: String): Card {
            val rawSuit = Suit.parse(input[0].toString())
            val rawNumber = input.substring(1, input.length)

            val number = when(rawNumber){
                "J" -> 11
                "Q" -> 12
                "K" -> 13
                "A" -> 1
                else -> rawNumber.toInt()
            }
            return Card(number = number, rawSuit)
        }
    }
}

enum class Suit(val suit: String) {
    Heart("H"),
    Diamond("D"),
    Club("C"),
    Spades("S");

    companion object{

        fun parse(input:String):Suit{
            return when(input){
                "H" -> Suit.Heart
                "D" -> Suit.Diamond
                "C" -> Suit.Club
                "S" -> Suit.Spades
                else -> error("??")
            }
        }
    }
}



