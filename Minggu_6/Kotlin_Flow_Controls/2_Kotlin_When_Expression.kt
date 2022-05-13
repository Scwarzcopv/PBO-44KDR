fun main(args: Array<String>) {
    //############################################### Simple when Expression
    val a = 12
    val b = 5
    println("Enter operator either +, -, * or /")
    val operator = readLine()
    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }
    println("result = $result")
    println()

    //############################################### Combine two or more branch conditions with a comma
    val c = -1
    when (c) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than 3.")
    }
    println()

    //############################################### Check value in the range
    val d = 100
    when (d) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }
    println()

    //############################################### Use expressions as branch condition
    val e1 = 11
    val e2 = "11"
    when (e2) {
        "cat" -> println("Cat? Really?")
        12.toString() -> println("Close but not close enough.")
        e1.toString() -> println("Bingo! It's eleven.")
    }
}