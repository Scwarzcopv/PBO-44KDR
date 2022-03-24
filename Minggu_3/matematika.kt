import kotlin.math.max

class mm (var angka1: Int, var angka2: Int) {
}

fun plus(angka1: Int, angka2: Int): Int {
    val x = mm (10, 20)
    return x.angka1 + x.angka2
}

fun min (angka1: Int, angka2: Int): Int {
    val x = mm (10, 20)
    return x.angka1 - x.angka2
}

fun multi (angka1: Int, angka2: Int): Int {
    val x = mm (10, 20)
    return x.angka1 * x.angka2
}

fun divide (angka1: Int, angka2: Int): Int {
    val x = mm (20, 20)
    return x.angka1 / x.angka2
}

fun main () {
    println(plus(0, 0))
    println(min(0, 0))
    println(multi(0, 0))
    println(divide(0, 0))

}