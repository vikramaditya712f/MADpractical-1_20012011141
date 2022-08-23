class Car(comm:String, year:Long, price:Int, owner:String, miles:Int,cuprice:Int){
    var ty : String = comm
    var yr = year
    var pr : Int = price
    var ow = owner
    var mi : Int = miles
    var cp : Int = cuprice

    fun getCarPrice(){
        println("$" + (pr-mi).toString())
    }
    fun getCarInformation(){
        println("Car Information : $ty, $yr")
        println("Car Owner : $ow")
        println("Miles drive : $mi")
        println("Original Car Price : $pr")
        println("Current Car Price : $cp")
    }
}
fun main() {
    println("Creating class car object car1 in next line")
    println("Object of class is created and Init is called")
    println("-----------------")
    var car1 = Car("BMW",2018,100000,"Aman",105,98950)
    car1.getCarInformation()

    println("Creating class car object car1 in next line")
    println("Object of class is created and Init is called")
    println("-----------------")
    var car2=Car("Force",2017,600000,"Vinayak",300,900000)
    car2.getCarInformation()
}
