//variable in Kotlin is declared using the keyword val or var

//val is used to declare a read-only variable
//var is used to declare a mutable variable

//The type of the variable is optional. 
//If you don't specify the type, 
//Kotlin will automatically infer it from the value assigned to the variable.  

//The type of the variable can be explicitly specified as follows:

//val name: String = "Kotlin"
//var age: Int = 10
//var salary: Double = 1000.0
//var isMarried: Boolean = false

// example code
fun main(args: Array<String>) {
    val name: String = "Kotlin"
    var age: Int = 10
    var salary: Double = 1000.0
    var isMarried: Boolean = false

    println("Name: $name")
    println("Age: $age")
    println("Salary: $salary")
    println("Married: $isMarried")
}