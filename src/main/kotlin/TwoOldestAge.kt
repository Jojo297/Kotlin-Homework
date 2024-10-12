fun age(){

    val oldestAge = mutableListOf(6,5,83,5,3,18)
    println(twoOldestAges(oldestAge))
}

fun twoOldestAges(ages: List<Int>): List<Int> {
//    Kita menggunakan sortedDescending() untuk mengurutkan list dari yang terbesar ke terkecil.
//    Kemudian kita menggunakan take(2) untuk mengambil dua elemen pertama (yang merupakan dua usia tertua).
//    return ages.sortedDescending().take(2)
    var max = 0
    var min = 0
    for (age in ages){
        if (age >= max){
            max = age
        }
        else if (age > min && min != max){
            min = age
        }
    }

    return listOf(min, max)
}