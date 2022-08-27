package sandbox.exercise.solved

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

internal class PopBalloonsTest : AnnotationSpec() {

    private val popBalloons = PopBalloons()

    @Test
    fun `풍선 터뜨리기`() {
        // 2 3 5
        popBalloons.solution(5, intArrayOf(3, 2, 1, -3, -1)) shouldBe arrayOf(1, 4, 5, 3, 2)
        popBalloons.solution(1, intArrayOf(3)) shouldBe arrayOf(1)
        popBalloons.solution(2, intArrayOf(5, -5)) shouldBe arrayOf(1, 2)
        popBalloons.solution(4, intArrayOf(-1, -2, -3, -4)) shouldBe arrayOf(1, 4, 2, 3)
    }
}
