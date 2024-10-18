import java.awt.Color

class Gruzovik(color: Color,
                gosNomer: Int,
                model: String,
    destination: Destination):
    Car(color, gosNomer, model) {

    override fun make_signal() {
        println("BEEEEEEEEE")
    }
}