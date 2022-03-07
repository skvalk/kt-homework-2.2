fun main() {
    val likes = 21
    val result: String = if (likes % 10 == 1 && likes != 11) "человеку." else "людям."
    println("Понравилось $likes $result")
}