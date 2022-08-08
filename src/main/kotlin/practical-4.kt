fun main()
{
    println("Enter number")
    var x= readLine()!!.toInt()
    println(
        if (x%2==0)
            println("Entered number is even")
        else
            println("Entered number is odd")
    )
}