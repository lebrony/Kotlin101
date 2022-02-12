fun main(args:Array<String>){
    println("Please Enter your Age!")
    var age = readLine()!!.toInt()
    if (age >= 18){
        if (age < 10){
            println("Well you are still a kid")
        } else {
            println("well you are a teenager")
        }
    }
}