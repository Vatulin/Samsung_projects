package RPG

abstract class Human(
    var health: Double,
    var power: Int
) {

    abstract fun attack(): Double
    abstract fun heal()
    abstract fun deamage(uron: Double)
}