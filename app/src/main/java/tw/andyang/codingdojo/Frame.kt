package tw.andyang.codingdojo

class Frame(val pins: Array<Int>) {
    fun type(): FrameType {

        return when {
            pins.size == 2 && pins[0] == 10 -> FrameType.STRIKE
            pins.size == 2 && pins.sum() == 10 -> FrameType.SPARE
            else -> {
                FrameType.NORMAL
            }
        }
    }

}
