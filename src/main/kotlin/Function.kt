fun searchList(){

    val listData = mutableListOf(2,5,4,6,8)

    println("This list looks like the following: $listData")

    val number = readLine()?.toInt()

    if (number != null)
        findIndex(listData, number)

}
fun findIndex(listData: List<Int>, number: Int) {
    for (i in listData.indices ){
        if (number == listData[i]){
            return println("the index of ${listData[i]} is ${i} ")
        }
    }
    println(-1)
}