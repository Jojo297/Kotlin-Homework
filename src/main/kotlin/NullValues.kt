fun checkAge(){
    println("Please enter your age:")

    val userInput = readLine()?.toInt()

    if (userInput != null){
        if (userInput <= 18 ){
            println("You to young kids!")
        }else if(userInput <= 35){
            println("Your are an adult")
        }else if(userInput >= 40) {
            println("You are relly relly old")
        }

    }
}