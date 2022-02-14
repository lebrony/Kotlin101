fun main(args:Array<String>){
    val arrayList = ArrayList<String>()
    arrayList.add("Adams")
    arrayList.add("Fredy")
    arrayList.add("Mama")
    arrayList.add("Merina")

    println("get first name: " + arrayList.get(0))

    //print all element by object
    println("all element by object")
    for (item in arrayList){
        println(item)
    }

    //print element by index
    println ("all element by index:")
    for (index in 0..arrayList.size-1){
        println(arrayList.get(index))
    }
}