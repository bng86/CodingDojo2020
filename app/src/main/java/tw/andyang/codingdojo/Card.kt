package tw.andyang.codingdojo

import java.lang.Exception
import java.lang.IllegalArgumentException

class Card(val number: Int = 2, val suit: Suit = Suit.Heart) {



    companion object {
        fun create(input: String): Card {
            val rawSuit = input[0]
            val rawNumber = input.substring(1, input.length)

            val number = try {
                rawNumber.toInt()
            } catch (e: Throwable){
                when(rawNumber) {
                    "J" -> 11
                    "Q" -> 12
                    "K" -> 13
                    "A" -> 1
                    else -> throw IllegalArgumentException("Hello rWorld")
                }
            }
            return Card(number = number)
        }
    }
}

enum class Suit {
    Heart
}
