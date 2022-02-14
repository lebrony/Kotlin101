fun main(args:Array<String>){
    //mutable list that does not accept change or addition
    val List = setOf(31, 6, 20, 21, 1, 7, 19, 61)
    for (element in List){
        println(element)
    }
    //imutable list that accept changes and addition of data
    var Lists = mutableListOf(31, 6, 20, 21, 1, 7, 19, 61)
    Lists.add(21)
    for (element in Lists){
        println(element)
    }

}