fun list(){
    val list = mutableListOf<Int>()

    println("Please enter 5 number:")
    for (i in 1..5){
        var number = readLine()?.toInt()
        if (number != null){
            list.add(number)
        }
    }
    println("The 5 number in reverse order are")
//    menghitung value yg ada di list lalu dikurang 1
    for (i in list.size - 1 downTo  0 ){
        println(list[i])

    }

}