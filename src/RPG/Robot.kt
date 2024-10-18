package RPG

import kotlin.random.Random

class Robot(health: Double,
            power: Int,
            var battery: Int): Human(health, power) {

    val robotFace = """
            __
   _  |@@|
  / \ \--/ __
  ) O|----|  |   __
 / / \ }{ /\ )_ / _\
 )/  /\__/\ \__O (__
|/  (--/\--)    \__/
/   _)(  )(_
   `---''---`
      Robot
   ******** ${health.toInt()}
   атака $power
   батарея $battery
    """.trimIndent()

    override fun attack(): Double {

        if (this.battery > 0) {
            this.battery -= 1
            return Random.nextInt(power - 10, power + 10).toDouble()
        }
        else {
            println("Заряж батареии равен нулю, робот пропускает ход")
            this.battery = 5
            return 0.0
        }
    }

    override fun heal() {
        if (this.battery > 0) {
            val heal = Random.nextInt(0, 10)
            println("Робот восстановил $heal здоровья")
            this.health += heal
        }
    }

    override fun deamage(uron: Double) {
        println("Робот получил $uron единиц урона")
        this.health -= uron
    }

    fun get_health(): Double {
        println("Оставшееся HP: ")
        return this.health
    }

    fun get_ava() : String {
        return robotFace
    }
}
