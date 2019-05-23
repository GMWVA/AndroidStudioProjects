open class Vehicle ( val color: String, val make: String, val model: String){
    fun details(){
        println("I drive a $color $make $model")
    }
}

class Car(color: String, make: String, model: String, var kpl: Int) : Vehicle(color, make, model){
    fun kplStatement(){
        println("My $make gets $kpl kpl")
    }
}

class Truck(color: String, make: String, model: String, var tow: Int) : Vehicle(color, make, model){
    fun towStatement(){
        println("My $make truck can tow $tow kilos")
    }
}


fun main() {
    val myCar = Car("White", "Honda", "Civic", 17)
    myCar.details()
    myCar.kplStatement()

    val myTruck = Truck("Black", "Toyota", "Tundra", 5000)
    myTruck.details()
    myTruck.towStatement()

}