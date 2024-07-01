//Increament and Decreament Operators

fun main(){
    var a = 10
    var b = 5
    var result: Int

    a++
    println("a++ = $a")

    b--
    println("b-- = $b")

    result = ++a
    println("++a = $result")

    result = --b
    println("--b = $result")

    result = a++
    println("a++ = $result")

    result = b--
    println("b-- = $result")
}