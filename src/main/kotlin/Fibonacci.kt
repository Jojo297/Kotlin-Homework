fun getFibonacci(){
    println("enter a number n > 1:")

    var list = mutableListOf<Int>()

    val n = readLine()?.toInt()

    var a = 0 ; var b = 1; var temp = 0
    if (n != null){
//        mengulang sampai sesuai dengan yang diinputkan
        for(i in 1..n){
            list.add(a)
            temp = a + b
            b = a
            a = temp
        }
    }
    println(list)
}