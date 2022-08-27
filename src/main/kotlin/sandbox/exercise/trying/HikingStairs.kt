package sandbox.exercise.trying

// 계단 오르기
// https://www.acmicpc.net/problem/2579
class HikingStairs {

    fun solution(size: Int, stairs: List<Int>): Int {

        if (size == 1) {
            return stairs[0]
        }

        if (size == 2) {
            return stairs[0] + stairs[1]
        }

        // x번째 계단의 최적해는 x-1, x-2 계단의 max
        val notDoubleStair = IntArray(size) { _ -> 0 }
        val doubleStair = IntArray(size) { _ -> 0 }

        notDoubleStair[0] = stairs[0]

        notDoubleStair[1] = stairs[1]
        doubleStair[1] = stairs[0] + notDoubleStair[0]

        // stairs   =  [10, 20, 15, 25, 10, 20]
        // 목적지 계단
        // 건너뛴 최적해 -> 붙여 건넌 최적해 등록
        // 붙여건넌 최적해 -> 건너뛴 최적해로 등록
        // notDouble = [10, 20, 25, 55, 55, 80] //
        // double    = [00, 30, 35, 45, 00, 00] //직전에 이어오른 최적해

//        // dp 시작
//        for (i in 2 until size) {
//            val stair = stairs[i]
//
//            if (notDoubleStair[i - 1] > notDoubleStair[i - 2] && !doubleStair[i - 1]) {
//                notDoubleStair[i] = stair + notDoubleStair[i - 1]
//                doubleStair[i] = true
//            } else {
//                notDoubleStair[i] = stair + notDoubleStair[i - 2]
//                doubleStair[i] = false
//            }
//        }

        return notDoubleStair[size - 1]
    }
}
