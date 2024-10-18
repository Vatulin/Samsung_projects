import java.awt.Color
import java.util.*

fun main() {

    //car - Объект класса, Car - класс
    val car1 = Car(Color.red, 1456, "lada sydan") //Конструктор
    val car2 = Car(Color.red, 234, "lada sydan") //Конструктор
    val car3 = Car(Color.red, 679, "lada sydan") //Конструктор
    val car4 = Car(Color.red, 123, "lada sydan") //Конструктор

    var areeyCars = arrayOf(car1, car2, car3, car4)
    Arrays.sort(areeyCars, CustomComporator())
    println(areeyCars.contentToString())

    val cabriolet = Cabriolet(Color.pink, 777, "BMW", true)
    val animal = Animal("123", "Keng", 15)
    val gruzovik = Gruzovik(Color.red, 556, "Kamaz", Destination.North)
}