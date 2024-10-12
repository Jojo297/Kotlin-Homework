fun varArg(){

    val sum = alternaetingSum(3,4,5,2,1,2,3)
    println("The alternating sum is $sum")
}

fun alternaetingSum(vararg numbers : Int): Int{
    var result = 0
    for (i in numbers.indices){
//        yang genap di tambah yg ganjil dikurang
        if (i % 2 == 0) result += numbers[i] else result -= numbers[i]
    }
    return result
}