package sandbox.exercise.solved

import java.util.*

class KeyLogger {

    // 키로거
    // https://www.acmicpc.net/problem/5397
    fun solution(logging: String): String {
        val keyStack = Stack<Char>()
        val remain = Stack<Char>()

        for (c in logging) {
            when (c) {
                '<' -> {
                    try {
                        val pop = keyStack.pop()
                        if (pop != null) {
                            remain.push(pop)
                        }
                    } catch (e: Exception) {
                    }
                }
                '>' -> {
                    try {
                        val pop = remain.pop()
                        if (pop != null) {
                            keyStack.push(pop)
                        }
                    } catch (e: Exception) {
                    }
                }
                '-' -> {
                    try {
                        keyStack.pop()
                    } catch (e: Exception) {
                    }
                }
                else -> {
                    keyStack.push(c)
                }
            }
        }
        return keyStack.joinToString(separator = "") + remain.reversed().joinToString(separator = "");
    }
}
