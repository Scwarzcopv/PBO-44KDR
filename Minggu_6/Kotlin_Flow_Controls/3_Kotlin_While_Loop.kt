fun main(args: Array<String>) {
    //############################################### Kotlin while Loop
    var i = 1
    while (i <= 5) {
        println("Line $i")
        ++i
    }
    println()

    //############################################### Compute sum of Natural Numbers
    var sum = 0
    i = 100
    while (i != 0) {
        sum += i     // sum = sum + i;
        --i
    }
    println("sum = $sum")
    println()

    //############################################### Kotlin do...while Loop
    var sum2: Int = 0
    var input: String
    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum2 += input.toInt()

    } while (input != "0")
    println("sum = $sum2")
}