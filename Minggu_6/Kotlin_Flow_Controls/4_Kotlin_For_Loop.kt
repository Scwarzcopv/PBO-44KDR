fun main(args: Array<String>) {
    //############################################### Iterate Through a Range
    for (i in 1..5) {
        println(i)
    }
    println()

    //############################################### Different Ways to Iterate Through a Range
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)
    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing
    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)
    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
    println()

    //############################################### Iterate through a String array
    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for (item in language)
        println(item)
    println()

    //############################################### Iterate through an array with an index
    language = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for (item in language.indices) {
        // printing array elements having even index only
        if (item%2 == 0)
            println(language[item])
    }
    println()

    //############################################### Iterate Through a String
    var text= "Kotlin"
    for (letter in text) {
        println(letter)
    }
    println()

    //############################################### Iterate through a String with an index
    text= "Kotlin"
    for (item in text.indices) {
        println(text[item])
    }
    println()
}