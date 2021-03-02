package tw.andyang.codingdojo

class Dices(
    private val point1: Int,
    private val point2: Int,
    private val point3: Int,
    private val point4: Int
) {
    private val points = listOf(point1, point2, point3, point4)

    companion object {
        const val TYPE_SINGLE = 1;

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
            when (grouped.size) {
                1 -> {
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
                }
                2 -> {
                    if(grouped[6]?.size==2){
                        LA18
                    } else {
                        6 // case 3331
                    }

                }
                3 -> {
                    var sum = 0
                    grouped.entries.forEach {
                        if (it.value.size == 1) {
                            sum += it.key
                        }
                    }
                    sum
                }
                else -> {
                    5
                }
            }
        }
    }
}