fun getAverage(){

    println("enter 5 number:")

    var result = 0
    for (i in 1..5){
        var number = readLine()?.toInt()
        if (number != null){
            result += number
        }
    }
    println("The avarage value is ${result.toDouble() / 5}")


}