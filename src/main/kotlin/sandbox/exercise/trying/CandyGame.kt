package sandbox.exercise.trying

// 사탕 게임
// https://www.acmicpc.net/problem/3085
class CandyGame {

    fun solution(size: Int, candies: MutableList<MutableList<Char>>): Int {
        // 가로 0 ~ size-2 + 1 ~ size-1
        // 세로 0 ~ size-2 + 1 ~ size-1
        var index = size - 1

        var max = 0

        // 가로검사
        // i가 0일 때 : 0, 1 부터 0, 1, 2, 3, 4 검사
        // i가 1일 떄 : 1, 2 부터 1, 2, 3, 4 검사
        for (i in 0..index) {
            var row = candies[i]

            for (j in i + 1..index) {
                var candy = row[i]
                val targetCandies = row.subList(i, j + 1)

                if (targetCandies.all { it == candy } && targetCandies.size > max) {
                    max = targetCandies.size
                }
            }
        }

        return max
    }
}
