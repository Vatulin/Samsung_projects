import java.awt.Color
//Инкапсуляция, Наследование, Полиморфизм - принципы ООП

open class Car(
    private var color: Color,
    var gosNomer: Int,
    private var model: String
): iFly {
    companion object {
        var cnt: Int = 0

        fun cntIncrease() {
            cnt++
        }
    }

    override var countFlying: Int = 0

    override fun toString(): String {
        return "Car(Nomer = ${this.gosNomer})"
    }

    override fun fly() {
        super.fly()
        println("Научил машину летать")
    }

    open fun make_signal() {
        cntIncrease()
        println("Beeeee")
    }

    fun redraw(color: Color) {
        this.color = color
    }

    //getter
    fun get_color() : Color {
        return this.color
    }

    //setter
    fun set_color(color: Color) {
        this.color = color
    }
}