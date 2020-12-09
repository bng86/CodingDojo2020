package tw.andyang.codingdojo

import java.lang.IllegalStateException

class Frame(val pins: Array<Int>) {
    fun type(): FrameType {

        if (pins.first() == 10 && pins.size > 1) throw IllegalStateException()

        return when {
            pins[0] == 10 -> FrameType.STRIKE
            pins.size == 2 && pins.sum() == 10 -> FrameType.SPARE
            else -> {
                FrameType.NORMAL
            }
        }
    }

}
