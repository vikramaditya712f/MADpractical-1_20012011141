fun main()
{
    println("Create Array-1 by using arrayOf() method:")
    val array1 = arrayOf(10, 90, 60, 80, 100)

    printArray(array1)
    println()

    println("Create Array-2 by using Array<>() method:")
    val array2 = Array<Int>(5){0}

    printArray(array2)
    println()

    println("Create Array-3 by using Array<>() and lambda method:")
    val array3 = Array(7){i : Int->i}

    printArray(array3)
    println()

    println("Create Array-4 by using IntArray() method:")
    val array4 = IntArray(5)

    printArray(array4.toTypedArray())
    println()

    println("Create Array-5 by using intArrayOf() method:")
    val array5 = intArrayOf(12, 10, 1, 5, 18, 19)

    printArray(array1)
    println()

    println("Create 2-D Array-6 using arrayOf() and intArrayOf()")
    val array6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(6, 7))

    printArray(array6)
    println()

    println("Please enter array values :")
    val array7 = arrayOfNulls<Int>(5)
    val array8 = array7

    for(i in 0..4)
    {
        print("a[$i] = ")
        array7[i] = readLine()!!.toInt()
    }

    println()
    println("Entered array : ")

    for(i in array7)
    {
        print(" "+i)
    }

    println()
    println()
    println("*************** With Built-in Function ***************")
    println()

    array8.sort()

    println("After sorting by Built-in Function :")
    for(i in array8)
    {
        print(" "+i)
    }

    println()
    println()
    println("*************** Without Built-in Function ***************")
    println()

    fun sortarray(array7 : Array<Int>)
    {
        val len = array7.size
        println(len)
        var temp=0

        for(i in 0 until len-1)
        {
            for(j in i until len-1)
            {
                if(array7[i] > array7[j])
                {
                    temp = array7[i]
                    array7[j] = array7[i]
                    array7[i] = temp
                }
            }
        }
    }

    println()
    println("After sorting without Built-in Function :")

    for(i in array7)
    {
        print(" "+i)
    }

}

fun printArray(arr: Array<IntArray>)
{
    for(i in arr)
    {
        print(" "+i.contentToString())
    }
}

fun printArray(arr: Array<Int>)
{
    for(i in arr)
    {
        print(" "+i)
    }
}
