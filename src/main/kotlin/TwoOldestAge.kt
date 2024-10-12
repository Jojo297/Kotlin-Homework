fun age(){

    val oldestAge = mutableListOf(6,5,83,5,3,18)
    println(twoOldestAges(oldestAge))
}

fun twoOldestAges(ages: List<Int>): List<Int> {
//    sorted(): Ini mengurutkan list dari nilai terkecil ke terbesar.
//    takeLast(2): Ini mengambil dua elemen terakhir dari list yang sudah diurutkan, yang merupakan dua nilai terbesar.
//    return ages.sorted().takeLast(2)

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