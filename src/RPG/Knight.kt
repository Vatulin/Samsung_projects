package RPG

import kotlin.random.Random

class Knight(health: Double,
             power: Int,
             var armor: Int,
             var half_of_health: Double = health / 2): Human(health, power) {

    val knightFace = """
         .-.
                      |_:_|
                     /(_Y_)\
.                   ( \/M\/ )
 '.               _.'-/'-'\-'._
   ':           _/.--'[[[[]'--.\_
     ':        /_'  : |::"| :  '.\
       ':     //   ./ |oUU| \.'  :\
         ':  _:'..' \_|___|_/ :   :|
           ':.  .'  |_[___]_|  :.':\
            [::\ |  :  | |  :   ; : \
             '-'   \/'.| |.' \  .;.' |
             |\_    \  '-'   :       |
             |  \    \ .:    :   |   |
             |   \    | '.   :    \  |
             /       \   :. .;       |
            /     |   |  :__/     :  \\
           |  |   |    \:   | \   |   ||
          /    \  : :  |:   /  |__|   /|
      snd |     : : :_/_|  /'._\  '--|_\
          /___.-/_|-'   \  \
                         '-'
                   Рыцарь
         *********** ${health.toInt()}
            атака $power
            броня $armor"""
    override fun attack(): Double {
        return Random.nextInt(power - 10, power + 10).toDouble()
    }

    override fun heal() {
        if (health > half_of_health) {
            val value = Random.nextInt(1, 10) * 2
            println("Knight получил хил: $value")
            this.health += value
        }
        else {
            val value = Random.nextInt(1, 10)
            println("Рыцарь получил хил: $value")
            this.health += Random.nextInt(1, 10)
        }
    }

    override fun deamage(uron: Double) {
        if (armor > 0) {
            this.health -= uron / 2
            println("Рыцарь получил урон: ${uron / 2}")
            this.armor -= 1
            println("Броня уменьшена на 1")
        }
        else {
            this.health -= uron
            println("Knight получил урон: $uron")
        }
    }

    fun get_ava(): String{
        return knightFace
    }
}