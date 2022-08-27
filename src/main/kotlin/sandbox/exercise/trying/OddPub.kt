package sandbox.exercise.trying

// 이상한 술집
// https://www.acmicpc.net/problem/13702
class OddPub {

    fun solution(size: Int, people: Int, mixedKettles: List<Long>): Long {
        val kettles = mixedKettles.sorted()

        var max = kettles.maxOf { it }
        var min = 0L


        if (max < people) {
            return 0
        }

        while (max >= min) {
            var cups = 0L
            var middle = (max + min) / 2

            if (middle == 0L) {
                return max
            }

            kettles.forEach { cups += it / middle }

            if (cups >= people) {
                min = middle + 1
            } else {
                max = middle - 1
            }
        }

        return max
    }
}
