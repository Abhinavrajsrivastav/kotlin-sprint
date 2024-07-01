//For loop

fun main(args: Array<String>) {
    
    var i = 1;

    //for loop
    for(i in 1..5){
        print(i)
    }

    //untill- 1 until 5 means 1 to 4
    for(i in 1 until 5){
        print(i)
    }

    //downto - 5 down to 1 means 5 to 1
    for(i in 5 downTo 1){
        print(i)
    }

    //step - 1 to 5 with step 2 means 1,3,5
    for(i in 1..5 step 2){
        print(i)
    }

    //step - 5 down to 1 with step 2 means 5,3,1
    for(i in 5 downTo 1 step 2){
        print(i)
    }

    
    //step - 1 until 5 with step 2 means 1,3
    for(i in 1 until 5 step 2){
        print(i)
    }
}