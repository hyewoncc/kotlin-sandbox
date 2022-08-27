package sandbox.exercise.trying

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

internal class OddPubTest : AnnotationSpec() {

    private val oddPub = OddPub()

    @Test
    fun `이상한 술집`() {
        oddPub.solution(2, 3, listOf(702, 429)) shouldBe 351
        oddPub.solution(4, 11, listOf(427, 541, 774, 822)) shouldBe 205
        oddPub.solution(5, 7, listOf(100, 15, 0, 0, 0)) shouldBe 15
        oddPub.solution(1, 1, listOf(2100000000)) shouldBe 2100000000
        oddPub.solution(1, 1, listOf(1)) shouldBe 1
        oddPub.solution(3, 2, listOf(3, 0, 0)) shouldBe 1
        oddPub.solution(3, 4, listOf(3, 0, 0)) shouldBe 0
        oddPub.solution(2, 4, listOf(5, 5)) shouldBe 2
    }
}
