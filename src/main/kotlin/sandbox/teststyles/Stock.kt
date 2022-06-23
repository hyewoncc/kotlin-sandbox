package sandbox.teststyles

class Stock(private val value: Int) {
    init {
        require(value >= 0) {"재고는 음수가 될 수 없습니다."}
    }
}