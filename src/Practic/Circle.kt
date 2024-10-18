package Practic

class Circle(val radius: Int, val pi: Double = 3.14): Shape() {
    override fun area(): Double {
        return pi * (radius*radius)
    }
}