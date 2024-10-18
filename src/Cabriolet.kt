import java.awt.Color

//Наследование
class Cabriolet(color: Color,
                gosNomer: Int,
                model: String,
                var stateRoof: Boolean): Car(color, gosNomer, model) {
    override fun make_signal() {
            println("beee")
        }

    fun changeStateRoof() {
        stateRoof = !stateRoof
    }
                }