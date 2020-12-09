package tw.andyang.codingdojo

class Game(private val frames: List<Frame>) {

    fun getScore(): Int {

        var score = 0
        for (frame in frames) {
            score += frame.score()
        }
        return score
    }
}
