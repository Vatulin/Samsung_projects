package Practic

class Triangle(val base: Double, val hight: Double): Shape() {

    override fun area(): Double {
        return 0.5*base*hight
    }
}