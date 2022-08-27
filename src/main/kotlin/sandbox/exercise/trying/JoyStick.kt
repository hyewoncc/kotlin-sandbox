package sandbox.exercise.trying

// 조이스틱
// https://school.programmers.co.kr/learn/courses/30/lessons/42860
class JoyStick {

    fun solution(name: String): Int {
        val chars = mapOf(
            Pair('A', 1),
            Pair('B', 2),
            Pair('C', 3),
            Pair('D', 4),
            Pair('E', 5),
            Pair('F', 6),
            Pair('G', 7),
            Pair('H', 8),
            Pair('I', 9),
            Pair('J', 10),
            Pair('K', 11),
            Pair('L', 12),
            Pair('M', 13),
            Pair('N', 14),
            Pair('O', 15),
            Pair('P', 16),
            Pair('Q', 17),
            Pair('R', 18),
            Pair('S', 19),
            Pair('T', 20),
            Pair('U', 21),
            Pair('V', 22),
            Pair('W', 23),
            Pair('X', 24),
            Pair('Y', 25),
            Pair('Z', 26),
        )

        val upDown = mutableListOf<Int>()
        var turnOver = false

        for ((i, n) in name.withIndex()) {
            val up = chars[n]!! - 1
            val down = 27 - chars[n]!!

            var best = if (up < down) up else down

            if (i < name.length - 1) {
                if (name[i + 1] == 'A' && !turnOver) {
                    turnOver = true
                    val left = name.substring(i + 1)
                    var target = 0
                    for ((j, l) in left.withIndex()) {
                        if (l != 'A') {
                            target = j + i + 1
                        }
                    }

                    if (target != 0) {
                        if (target - i > name.length - target + i + 1) {
                            best += (name.length - target + i + 1)
                        } else {
                            best += 1
                        }
                    }
                }
            }
            upDown.add(best)
        }

        return upDown.sum() - 1
    }
}
