fun main(args:Array<String>){
    val map = HashMap<Int, String>()
    map.put(1, "Adams")
    map.put(2, "Fredy")
    map.put(3, "Mama")
    map.put(4, "Merina")

    println(map.get(2))

    for (k in map.keys){
        println(map.get(k))
    }
}