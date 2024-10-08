fun main() {
    println("Please enter your age:")

    val userInput = readLine()

    if (userInput != null){
        if (userInput.toInt() <= 18 ){
            println("You to young kids!")
        }else if(userInput.toInt() <= 35){
            println("Your are an adult")
        }else if(userInput.toInt() >= 40) {
            println("You are relly relly old")
        }

    }
}