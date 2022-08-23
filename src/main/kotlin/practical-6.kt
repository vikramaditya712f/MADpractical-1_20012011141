fun main()
{
    sum()
    sub()
    mul()
    div()
}

fun sum()
{
    val num1 = 111
    val num2 = 2222
    val num3 = -222
    val result = num1 + num2 + num3
    println("Addition of $num1, $num2 and $num3 is $result")
}

fun sub()
{
    val num1 = 111
    val num2 = 2222
    val num3 = -222
    val result = num1 - num2 - num3
    println("Subtraction of $num1, $num2 and $num3 is $result")
}

fun mul()
{
    val num1 = 111
    val num2 = 2222
    val num3 = -222
    val result = num1 * num2 * num3
    println("Multiplication of $num1, $num2 and $num3 is $result")
}

fun div()
{
    val num1 = 2222
    val num2 = 111
    val result = num1 / num2
    println("Division of $num1 from $num2 is $result")
}

