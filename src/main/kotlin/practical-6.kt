fun main()
{
    var x= readLine()!!.toInt()
    var y= readLine()!!.toInt()
    val sum=0
    ops(x,y)
}

fun ops(x:Char,vararg y:Int):Int
{
    when(x)
    {
        '+'->{
            for(num in y)
            {
                sum=num+sum
            }
            println("Sum:$sum")

        }
        else->{

        }
    }
}