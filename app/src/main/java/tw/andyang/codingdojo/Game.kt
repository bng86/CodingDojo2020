package tw.andyang.codingdojo

class Game(private val frames: List<Frame>) {



    fun getScore(): Int {
        if (frames.size > 10) error("")
        var score = 0

        frames.forEachIndexed { index, frame ->
            score += frame.score()
            if (frame.type() == FrameType.SPARE) {
                if (index + 1 < frames.size) {
                    score += frames[index + 1].donwPins[0]
                }
            }
        }
        return score
    }
}
