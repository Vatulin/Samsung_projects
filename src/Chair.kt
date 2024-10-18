class Chair(material: String): Mebel(material) {
    override fun create(cnt: Int): Boolean {
        return false
    }
}