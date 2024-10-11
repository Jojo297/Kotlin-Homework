fun loopCount(){

    print("Please enter a number: ")

    var number = readLine()?.toInt()

    println("Lets count from $number to 0")

    if (number != null) {
        while (0 <= number) {
            println(number)
            number--
        }
    }

}