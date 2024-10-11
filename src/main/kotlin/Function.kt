fun searchList(){

    val listData = mutableListOf(2,5,4,6,8)

    println("This list looks like the following: $listData")

    val number = readLine()?.toInt()

    if (number != null)
        findIndex(listData, number)

}
fun findIndex(listData: List<Int>, number: Int) {
    //    indices = starting from 0 and going up to size - 1.
    //    This ensures that you access each element in the list correctly.
    for (i in listData.indices ){
        if (number == listData[i]){
            return println("the index of ${listData[i]} is ${i} ")
        }
    }
    println(-1)
}