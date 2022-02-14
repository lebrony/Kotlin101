fun main(args:Array<String>){
    val arrayInt = Array<Int>(5){0}
    arrayInt[2] = 60
    println("array index[2] "+ arrayInt[2])
    //we print element by objects
    for (element in arrayInt){
        println(element)
    }

    //we print elements by index
    for (index in 0..4){
        println(arrayInt[index])
    }

    val arrayStr = Array<String>(5){" "}
    for (index in 0..4){
        println("User input : ")
        arrayStr[index] = readLine()!!
    }
}