abstract class Mebel(
    val material: String
) {
    abstract fun create(cnt: Int): Boolean
}