package tw.andyang.codingdojo

class Game(private val frames: List<Frame>) {

    fun getScore(): Int {
        if (frames.size > 10) error("")
        var score = 0
        for (frame in frames) {
            score += frame.score()

        }

        return score
    }
}
