package tw.andyang.codingdojo

class Roll(
    private val point1: Int,
    private val point2: Int,
    private val point3: Int,
    private val point4: Int
) {

    companion object {
        const val SINGLE = 101
    }

    fun getPoint(): Int {
        if (point1 == point2 && point2 == point3 && point3 == point4) {
            return SINGLE
        } else {
            return 5
        }
    }
}