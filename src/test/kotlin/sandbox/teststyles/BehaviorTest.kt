package sandbox.teststyles

import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import sandbox.basic.Grammar

internal class BehaviorTest: BehaviorSpec({

    given("재고 생성 시") {
        `when`("양수 재고는") {
            val natural = 99
            then("정상 생성된다") {
                shouldNotThrowAny {
                     Stock(natural)
                }
            }
        }

        `when`("0 재고는") {
            val zero = 0
            then("정상 생성된다") {
                shouldNotThrowAny {
                    Stock(zero)
                }
            }
        }

        `when`("음수 재고는") {
            val negative = -1
            then("예외를 던진다") {
                shouldThrowExactly<IllegalArgumentException> {
                    Stock(negative)
                }
            }
        }
    }

    given("when으로 동물 소리룰 찾으면") {
        val grammar = Grammar()

        `when`("고양이는") {
            val name = "cat"
            val sound = grammar.whenAnimalSound(name)
            then("야옹이 나온다") {
                sound shouldBe "meow"
            }
        }

        `when`("개는") {
            val name = "dog"
            val sound = grammar.whenAnimalSound(name)
            then("멍멍이 나온다") {
                sound shouldBe "woff"
            }
        }

        `when`("이름 모를 동물은") {
            val name = "x"
            val sound = grammar.whenAnimalSound(name)
            then("unknown이 나온다") {
                sound shouldBe "unknown"
            }
        }
    }

})
