package tw.andyang.codingdojo

import org.junit.Test

class CardExceptionTest () {

    @Test(expected = CardParseException::class)
    fun `If input is HZ, throw CardParseException` () {
//        Arrange
        val card = Card.create("HZ")
    }

    @Test(expected = CardParseException::class)
    fun `if input is TT, throw CardParseException`() {
        val card = Card.create("TT")
    }
}