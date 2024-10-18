package Practic

class Rectangle(val len: Int, val hight: Int): Shape() {
    override fun area(): Double {
        return (len * hight).toDouble()
    }
}