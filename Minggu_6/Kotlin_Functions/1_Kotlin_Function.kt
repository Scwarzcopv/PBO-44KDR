fun callMe() {
    println("Printing from callMe() function.")
    println("This is cool (still printing from inside).")
}
fun addNumbers(n1: Double, n2: Double): Int {
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}
fun getName(firstName: String, lastName: String): String = "$firstName $lastName"

fun main(args: Array<String>) {
    //############################################### Kotlin Standard Library Function
    var number = 5.5
    print("Result = ${Math.sqrt(number)}")
    println()

    //############################################### Simple Function Program
    callMe()
    println("Printing outside from callMe() function.")
    println()

    //############################################### Add Two Numbers Using Function
    val number1 = 12.2
    val number2 = 3.4
    val result: Int

    result = addNumbers(number1, number2)
    println("result = $result")
    println()

    //############################################### Display Name by Using Function
    println(getName("John", "Doe"))
}