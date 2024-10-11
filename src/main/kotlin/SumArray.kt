fun sumArray(){
    val myArray = arrayOf(3,4,2,4)

    var result = 0
    for (item in myArray){
        result += item
    }
    println("The sum of the array is $result")
}