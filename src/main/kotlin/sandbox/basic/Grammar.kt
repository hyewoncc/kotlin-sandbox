package sandbox.basic

class Grammar {

    fun whenAnimalSound(name: String): String {
        val sound = when(name) {
            "cat" -> { "meow" }
            "dog" -> { "woff" }
            "cow" -> { "moo" }
            else -> { "unknown" }
        }
        return sound
    }

}