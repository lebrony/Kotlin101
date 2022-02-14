fun main(args:Array<String>){
    val map = hashMapOf(1 to "Mama", 2 to "Fredy", 3 to "Merina")
    map[4] = "Adams"
    println(map[3])
    println(map[4])

    val arr = arrayOf(22, 65, 98, 61)
    println(arr[3])

    val list = arrayListOf(55, 19, 31, 61, 6)
    for (item in list){
        println(item)
    }
}