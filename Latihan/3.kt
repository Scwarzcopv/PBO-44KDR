fun main() {
    print("Masukkan ukuran array: ")
    val lenght = readLine()!!.toInt()
    val arr = Array(lenght){0}
    var ada = false

    for (i in 0..lenght-1) {
        print("Array[$i] = ")
        arr[i] = readLine()!!.toInt()
    }

    print("Masukkan kelipatan bilangan yang ingin dicari: ")
    val search = readLine()!!.toInt()
    for (i in 0..lenght-1) {
        if (arr[i]%search == 0) {
            println("Element "+arr[i]+" ditemukan di index ke $i merupakan kelipatan bilangan $search")
            ada = true
        }
    }
    if (ada == false) {
        println("Tidak ditemukan kelipatan $search pada elemen index")
    }
}