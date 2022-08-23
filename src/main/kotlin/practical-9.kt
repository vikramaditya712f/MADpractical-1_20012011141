fun main() {
    println("Enter numbers for array")
    val a = ArrayList<Int>()
    for (i in 0..5) {
        print("a[$i] = ")
        val num : Int = readLine()!!.toInt()
        a.add(num)
    }

    println("Largest element = ${maxNum(a)}")
}

fun maxNum(arr : ArrayList<Int>): Int {
    var temp = arr[0]
    for (i in 0..5) {
        if (arr[i] > temp) {
            temp = arr[i]
        }
    }
    return temp
}