fun main()
{
    print("Enter number : ")
    val no = readLine()!!.toInt()

    val result = factorial(no)
    val tailresult = tailfactorial(no)

    println("Factorial of $no is $result")
    println("By tailrec keyword factorial of $no is $tailresult")
}

fun factorial(n : Int) : Int
{
    return if (n==1)
        n
    else
        n*factorial(n-1)
}

tailrec fun tailfactorial(n : Int, run : Int = 1) : Int
{
    return if (n==1)
        run
    else
        tailfactorial(n-1, run*n)
}