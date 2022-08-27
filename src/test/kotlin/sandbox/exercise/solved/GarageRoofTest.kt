package sandbox.exercise.solved

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

internal class GarageRoofTest : AnnotationSpec() {

    private val garageRoof = GarageRoof()

    @Test
    fun `창고 다각형`() {
        garageRoof.solution(
            7, mapOf(
                Pair(2, 4), Pair(11, 4), Pair(15, 8), Pair(4, 6),
                Pair(5, 3), Pair(8, 10), Pair(13, 6)
            )
        ) shouldBe 98
        garageRoof.solution(1, mapOf(Pair(5, 10))) shouldBe 10
    }
}
