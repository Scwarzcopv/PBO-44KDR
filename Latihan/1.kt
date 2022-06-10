fun main () {
    print("Input: ")
    val list = readLine()!!.toString()
    val lenght = list.length
    val mid = lenght/2
    var toright = 1
    var sameenergy = 0
    val o = "Output:"

    if (lenght > 2) {
        if (mid*2 != lenght) {
            for (i in mid downTo 1) {
                if (list[i-1] == list[i+toright]) {
                    sameenergy++
                }
                toright+=2
            }
            if (sameenergy == mid) {
                print("$o True")
            }
            else print("$o False")
        }

        else {
            for (i in mid-1 downTo 0) {
                if (list[i] == list[i+toright]) {
                    sameenergy++
                }
                toright+=2
            }
            if (sameenergy == mid) {
                print("$o True")
            }
            else print("$o False")
        }
    }
    else print("$o False")
}