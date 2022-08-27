package sandbox.exercise.solved

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

internal class KeyLoggerTest : AnnotationSpec() {

    private val keyLogger = KeyLogger()

    @Test
    fun `키로거`() {
        keyLogger.solution("<<BP<A>>Cd-") shouldBe "BAPC"
        keyLogger.solution("ThIsIsS3Cr3t") shouldBe "ThIsIsS3Cr3t"
        keyLogger.solution("a><><b") shouldBe "ba"
        keyLogger.solution("j><>-<u->xb<<a") shouldBe "axb"
    }
}
