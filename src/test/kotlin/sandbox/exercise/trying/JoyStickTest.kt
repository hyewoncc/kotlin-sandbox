package sandbox.exercise.trying

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

internal class JoyStickTest : AnnotationSpec() {

    private val joyStick = JoyStick()

    @Test
    fun `조이스틱`() {
        joyStick.solution("JEROEN") shouldBe 56
        joyStick.solution("JAN") shouldBe 23
    }
}
