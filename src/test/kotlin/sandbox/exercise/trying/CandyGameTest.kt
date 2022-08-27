package sandbox.exercise.trying

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

internal class CandyGameTest : AnnotationSpec() {

    private val candyGame = CandyGame()

    @Test
    fun `사탕게임`() {
        candyGame.solution(
            4, mutableListOf(
                mutableListOf('B', 'E', 'A'),
                mutableListOf('B', 'E', 'A'),
                mutableListOf('C', 'C', 'C')
            )
        ) shouldBe 2
    }
}
