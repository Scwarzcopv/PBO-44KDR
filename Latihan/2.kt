fun main() {
    print("Input: ")
    val n = readLine()!!.toInt()
    var process = "$n"
    var result = 1
    if (n < 1) {
        print("Bukan bilangan bulat")
    } else {
        for (i in n downTo 1) {
            if (i < n) {
                process += "*$i"
            }
            result *= i
        }
        print("Nilai $n! adalah: $process = $result")
    }
}