fun displayBorder(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
}
fun displayBorder2(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
}

fun main(args: Array<String>) {
    //############################################### Kotlin Default Argument
    println("Output when no argument is passed:")
    displayBorder()

    println("\n\n'*' is used as a first argument.")
    println("Output when first argument is passed:")
    displayBorder('*')

    println("\n\n'*' is used as a first argument.")
    println("5 is used as a second argument.")
    println("Output when both arguments are passed:")
    displayBorder('*', 5)
    println()

    //############################################### Kotlin named argument
    displayBorder2(length = 5)
}