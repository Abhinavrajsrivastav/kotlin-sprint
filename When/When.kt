//when in Kotlin - The when expression is the replacement of the switch statement.file

fun main(args: Array<String>) {
    val x = 2
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        3 -> println("x is 3")
        else -> {
            println("x is neither 1 nor 2 nor 3")
        }
    }
}