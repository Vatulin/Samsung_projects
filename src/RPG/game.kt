package RPG

import java.lang.reflect.Array
import java.util.Scanner
import kotlin.random.Random

fun main() {
    val input = Scanner(System.`in`)
    println("Добрый день !!!, давате создадим персонажей")
    while (true) {

        //Создаем персонажей
        println("Введите здоровье, силу и броню рыцаря: ")
        var health = input.nextDouble()
        var power = input.nextInt()
        var armor = input.nextInt()
        var knight = Knight(health, power, armor)

        println("Введите здоровье, силу и ману мага: ")
        health = input.nextDouble()
        power = input.nextInt()
        var mana = input.nextInt()
        var wizard = Wizard(health, power, mana)

        println("Введите здоровье, силу и батарею робота: ")
        health = input.nextDouble()
        power = input.nextInt()
        var battery = input.nextInt()
        var robot = Robot(health, power, battery)

        //Выводим профили персонажей
        println("Персонажи")
        println(robot.get_ava())
        println(wizard.get_ava())
        println(knight.get_ava())

        println("Вы хотите начать игру: [Y/N]")
        var a = readln()
        if (a != "Y") {
            continue
        }

        var characters = arrayOf(knight, wizard, robot)
        var turn = 0

        while (true) {

            var attacker = characters[turn % characters.size]
            var opponent = characters[(turn + 1) % characters.size]
            opponent.deamage(attacker.attack())
            attacker.heal()
            if (opponent.health < 0) {
                println("${characters[(turn + 1) % characters.size].javaClass.simpleName} прогиграл")
                break
            }
            turn += 1
        }
        println("Продолжть игру: [Y/N]")
        var b = readln()
        if (b == "Y") {
            continue
        }
        else {
            break
        }
    }
}

fun hello() {

}