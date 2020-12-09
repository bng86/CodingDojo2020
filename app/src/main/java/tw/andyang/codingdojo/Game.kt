package tw.andyang.codingdojo

class Game(private val frames: List<Frame>) {

    private var extraPins = 0

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
            else if (frame.type() == FrameType.STRIKE){
                var bonusPinLeft = 2
                var nextIndex = index + 1
                var nextFrame = frames[nextIndex]
                while (bonusPinLeft > 0 && index + 1 < frames.size ) {
                    for (i in nextFrame.donwPins.indices) {
                        bonusPinLeft --
                        score += nextFrame.donwPins[i]
                        if (bonusPinLeft == 0) {
                            break
                        }
                    }
                    nextIndex ++
                    if(nextIndex >= frames.size) {
                        break
                    }
                    nextFrame = frames[nextIndex]
                }
            }
        }
        return score + extraPins
    }

    fun addExtraPins(extraPins: Int) {
        this.extraPins = extraPins
    }
}
