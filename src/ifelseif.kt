fun main (args:Array<String>){
    println("Please Enter your age")
    var age = readLine()!!.toInt()
    if (age >= 18)
    {
        println("you are older enough to vote!")
    } else if (age <= 90)
    {
        println("well, you are absolutely able to vote!")
    } else
    {
        println("no offense but damn you are super old like egyptian mummy")
    }
}