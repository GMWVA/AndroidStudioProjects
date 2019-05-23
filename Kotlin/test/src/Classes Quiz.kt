open class Player(val name: String, val age: String, val gender: String){
    fun intro(){
        println("My name is $name.\nI am a $age $gender")
    }
    fun attack(){
        println("I will kill you!")
    }
    fun defend(){
        println("Don't hurt me!")
    }
    fun walk(){
        println("Left, left, left right left.")
    }
}

class Thief(name: String, age: String, gender: String, var weapon: String) : Player(name, age, gender){

    fun rob(){
        println("Give me gold or feel my $weapon!")
    }
}

class Warrior(name: String, age: String, gender: String, var weapon: String) : Player(name, age, gender){
    fun smash(){
        println("I will smash you with my $weapon!")
    }
}

fun main() {
    val myThief = Thief("Arro", "32yo", "Male", "Dagger")
    myThief.intro()
    myThief.attack()
    myThief.defend()
    myThief.walk()
    myThief.rob()

    println("")

    val myWarrior = Warrior("Gatlus", "22yo", "Male", "War Hammer")
    myWarrior.intro()
    myWarrior.attack()
    myWarrior.defend()
    myWarrior.walk()
    myWarrior.smash()
}