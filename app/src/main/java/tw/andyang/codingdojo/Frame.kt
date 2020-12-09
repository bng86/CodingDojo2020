package tw.andyang.codingdojo

class Frame(val pins: Array<Int>) {
    fun type(): FrameType {

        return when {
            pins[0] == 1 && pins[1] == 9 -> {
                FrameType.SPARE
            }

            pins[0] == 3 && pins[1] == 7 -> {
                FrameType.SPARE
            }

            else -> {
                FrameType.NORMAL
            }
        }
    }

}
