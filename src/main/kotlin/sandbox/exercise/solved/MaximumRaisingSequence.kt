package sandbox.exercise.solved

import kotlin.math.max

class MaximumRaisingSequence {

    // 가장 긴 증가하는 부분수열
    // https://www.acmicpc.net/problem/11053
    fun maximum_raising_sequence(size: Int, nums: Array<Int>): Int {
        val cache = Array(size) { 1 }

        for (i in 1 until size) {
            for (j in 0 until i) {
                if (nums[j] < nums[i]) {
                    cache[i] = max(cache[i], cache[j] + 1)
                }
            }
        }

        return cache.maxOf { it }
    }
}
