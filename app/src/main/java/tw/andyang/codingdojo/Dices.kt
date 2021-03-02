package tw.andyang.codingdojo

data class Dices(
    private val point1: Int,
    private val point2: Int,
    private val point3: Int,
    private val point4: Int
) {
    private val points = listOf(point1, point2, point3, point4)

    companion object {
        const val TYPE_SINGLE = 1
        const val TYPE_LA = 2
        const val TYPE_N = 3
        const val TYPE_NONE = 4

        const val SINGLE_ONE = 101
        const val SINGLE_TWO = 102
        const val SINGLE_THREE = 103
        const val SINGLE_FOUR = 104
        const val SINGLE_FIVE = 105
        const val SINGLE_SIX = 106
        const val LA18 = 90
    }

    fun roll(): Int {
        if (isSingle()) {
            return getSinglePoints()
        } else if (isLA18()) {
            return LA18
        } else if (isNPoint()) {
            return getNPoint()
        }

        return points.groupBy { it }.let { grouped ->
            when (grouped.size) {

                TYPE_LA -> {
                    if (grouped[6]?.size == 2) {
                        LA18
                    } else {
                        val isOneThree = grouped.entries.any{
                            it.value.size == 3
                        }
                        if (isOneThree){
                            0
                        }else{
                            val max =
                                grouped
                                    .keys
                                    .maxByOrNull {
                                        it
                                    }
                            max!! * 2
                        }




//                        6 // case 3331
                    }

                }
                TYPE_N -> {
                    var sum = 0
                    grouped.entries.forEach {
                        if (it.value.size == 1) {
                            sum += it.key
                        }
                    }
                    sum
                }
                TYPE_NONE -> {
                    0
                }
                else -> {
                    5
                }
            }
        }
    }

    private fun getNPoint(): Int {
        val group = points.groupBy { it }
        return if (isTwoPair()) {
            val max =
                group
                    .keys
                    .maxByOrNull {
                        it
                    }
            max!! * 2
        } else {
            group.values.filter { it.size ==1 }
                .flatten()
                .sum()
        }
    }

    private fun isTwoPair(): Boolean {
        val group = points.groupBy { it }
        return (group.size == 2 && group.values.all { it.size == 2 })
    }

    private fun isNPoint(): Boolean {
        val group = points.groupBy { it }
        return group.size == 3 || (group.size == 2 && group.values.all { it.size == 2 })
    }



    private fun isLA18(): Boolean {
        val group = points.groupBy { it }
        return group.containsKey(6) && group[6]?.size == 2
    }

    private fun getSinglePoints(): Int {
        return when (point1) {
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

    private fun isSingle(): Boolean {
        val group = points.groupBy { it }
        return group.size == 1
    }
}