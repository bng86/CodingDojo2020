package tw.andyang.codingdojo

class Frame {

    val donwPins: Array<Int>

    constructor(pin1: Int) {
        donwPins = arrayOf(pin1)
    }

    constructor(pin1: Int, pin2: Int) {
        donwPins = arrayOf(pin1, pin2)
    }

    fun type(): FrameType {

        if (donwPins.first() == 10 && donwPins.size > 1) throw IllegalStateException()

        return when {
            donwPins[0] == 10 -> FrameType.STRIKE
            donwPins.size == 2 && donwPins.sum() == 10 -> FrameType.SPARE
            else -> {
                FrameType.NORMAL
            }
        }
    }

    fun score(): Int {
        val sum = donwPins.sum()
        return if (sum > 10) {
            throw IllegalStateException()
        } else {
            sum
        }
    }

}
