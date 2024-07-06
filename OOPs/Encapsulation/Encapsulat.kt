//1. Encapsulation in Kotlin

//Encapsulation is one of the four fundamental OOP concepts.
//  The other three are inheritance, polymorphism, and abstraction.

// code example

class Encapsulat {
    private var name: String = "Kotlin"

    fun display() {
        println("The name of the language is $name")
    }
}

fun main(args: Array<String>) {
    val obj = Encapsulat()
    obj.display()
}

