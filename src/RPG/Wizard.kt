package RPG

import kotlin.random.Random

class Wizard(health: Double,
             power: Int,
             var mana: Int): Human(health, power) {

    val wizardFace = """
                .-----.
 \ ' /   _/    )/
- ( ) -('---''--)
 / . \((()\^_^/)()
  \\_\ (()_)-((()()
   '- \ )/\._./(()
     '/\/( X   ) \
     (___)|___/ ) \
          |.#_|(___)
         /\    \ ( (_
         \/\/\/\) \\
         | / \ |
         |(   \|
        _|_)__|_\_
        )...()...(
         | (   \ |     
      .-'__,)  (  \
  mrf           '\_-,
        Wizard
    *********** ${health.toInt()}
       атака $power
    mmmmmmmmmmm $mana
    """.trimIndent()
    override fun attack(): Double {
        if (mana > 0) {
            mana /= 2
            return (Random.nextInt(power - 10, power + 10) * 1.5).toDouble()
        }
        return Random.nextInt(power - 10, power + 10).toDouble()
    }

    override fun deamage(uron: Double) {
        this.health -= uron
        println("Волшебник получил $uron единиц урона")
    }

    override fun heal() {
        val heal = Random.nextInt(0, 10)
        this.health += heal
        println("Волшебник восстановил $heal здоровья")
    }

    fun get_ava(): String {
        return wizardFace
    }
}