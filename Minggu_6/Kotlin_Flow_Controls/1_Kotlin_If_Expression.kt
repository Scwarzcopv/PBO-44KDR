fun main(args: Array<String>) {
    //############################################### Traditional Usage of if...else
    var number = -10
    if (number > 0) {
        println("Positive number")
    } else {
        println("Negative number")
    }
    println()

    //############################################### Kotin if expression
    number = -10
    var result = if (number > 0) {
        "Positive number"
    } else {
        "Negative number"
    }
    println(result)

    number = -10
    result = if (number > 0) "Positive number" else "Negative number"
    println(result)
    println()

    //############################################### if block With Multiple Expressions
    val a = -9
    val b = -11
    val max = if (a > b) {
        println("$a is larger than $b.")
        println("max variable holds value of a.")
        a
    } else {
        println("$b is larger than $a.")
        println("max variable holds value of b.")
        b
    }
    println("max = $max")
    println()

    //############################################### if...else...if Ladder
    number = 0
    result = if (number > 0)
        "positive number"
    else if (number < 0)
        "negative number"
    else
        "zero"
    println("number is $result")
    println()

    //############################################### Nested if Expression
    val n1 = 3
    val n2 = 5
    val n3 = -2
    val maks = if (n1 > n2) {
        if (n1 > n3)
            n1
        else
            n3
    } else {
        if (n2 > n3)
            n2
        else
            n3
    }
    println("max = $maks")
}