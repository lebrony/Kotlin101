fun main(args:Array<String>){
    println("Enter your age please!")
    var age = readLine()!!.toInt()
    if (age >= 20){
        println("you are qualified to vote!")
    }
}