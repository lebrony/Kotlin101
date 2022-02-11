fun main(args:Array<String>){
    //variabe declaration
    println("Please enter your age!!")
    var age = readLine()!!.toInt()
    if (age >= 18)
    {
        println("You are qualified to vote!!")
    } else {
        println("Come back next year. Thank you!!")
    }
}