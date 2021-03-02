package tw.andyang.codingdojo

class Dices(
    private val point1: Int,
    private val point2: Int,
    private val point3: Int,
    private val point4: Int
) {
    private val points = listOf(point1, point2, point3, point4)

    companion object {
        const val SINGLE_ONE = 101
        const val SINGLE_TWO = 102
        const val SINGLE_THREE = 103
        const val SINGLE_FOUR = 104
        const val SINGLE_FIVE = 105
        const val SINGLE_SIX = 106
        const val LA18 = 90
    }

    fun roll(): Int {
        return points.groupBy { it }.let { grouped ->
            if(grouped.size==1) {
                when (point1) {
                    1 -> SINGLE_ONE
                    2 -> SINGLE_TWO
                    3 -> SINGLE_THREE
                    4 -> SINGLE_FOUR
                    5 -> SINGLE_FIVE
                    6 -> SINGLE_SIX
                    else -> {
                        TODO()
                    }
                }
            }else if(grouped.size==2){
                if(grouped[3]!!.size==1 && grouped[1]!!.size==1){
                    6
                }else
                LA18
            }else{
                5
            }

        }
    }
}