package sandbox.exercise.trying

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

internal class HikingStairsTest : AnnotationSpec() {

    private val hikingStairs = HikingStairs()

    @Test
    fun `계단 오르기`() {
        hikingStairs.solution(6, listOf(10, 20, 15, 25, 10, 20)) shouldBe 75
        hikingStairs.solution(2, listOf(10, 20)) shouldBe 30
        hikingStairs.solution(1, listOf(20)) shouldBe 20
        hikingStairs.solution(3, listOf(10, 20, 30)) shouldBe 50
    }
}
