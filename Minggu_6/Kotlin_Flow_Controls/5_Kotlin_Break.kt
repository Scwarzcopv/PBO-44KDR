fun main(args: Array<String>) {
    //############################################### Kotlin break
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
    println()

    //############################################### Calculate Sum Until User enters 0
    var sum = 0
    var number: Int
    while (true) {
        print("Enter a number: ")
        number = readLine()!!.toInt()

        if (number == 0)
            break

        sum += number
    }
    println("sum = $sum")
    println()

    //############################################### Kotlin Labeled break
    first@ for (i in 1..4) { //first=identifier
        second@ for (j in 1..2) {
            println("i = $i; j = $j")
            if (i == 2)
                break@first
        }
    }
    println()

    //############################################### Variation of the above program
    first@ for (i in 1..4) {
        second@ for (j in 1..2) {
            println("i = $i; j = $j")
            if (i == 2)
                break@second
        }
    }
}