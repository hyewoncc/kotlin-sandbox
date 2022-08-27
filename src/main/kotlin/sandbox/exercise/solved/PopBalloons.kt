package sandbox.exercise.solved

// 풍선 터뜨리기
// https://www.acmicpc.net/problem/2346
class PopBalloons {

    fun solution(size: Int, balloons: IntArray): IntArray {
        var index = 0
        var result = IntArray(size)

        var insert = 1
        result[index] = insert

        while (true) {
            var next = balloons[index]
            balloons[index] = 0

            val loop = balloons.any { it != 0 }

            if (!loop) {
                break
            }

            if (next > 0) {
                var move = 0
                while (move < next) {
                    index += 1
                    // 넘을 경우 되돌아가기
                    if (index == balloons.size) {
                        index = 0
                    }

                    // 0이 아닐 경우 건너기 실행
                    if (balloons[index] != 0) {
                        move += 1
                    }
                }
                result[insert] = index + 1

            } else {
                next *= -1
                var move = 0
                while (move < next) {
                    index -= 1

                    // 넘을 경우 되돌아가기
                    if (index == -1) {
                        index = balloons.size - 1
                    }
                    if (balloons[index] != 0) {
                        move += 1
                    }
                }
                result[insert] = index + 1
            }
            insert += 1
        }

        return result
    }

}
