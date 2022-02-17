import java.lang.reflect.Array.get

class car(val name: String, val model:Int, val Horsepower:Double, val Speed:Int){
    init {
        println("name :$name")
        println("Model :$model")
        println("Horsepower :$Horsepower")
        println("Speed :$Speed")
    }
}

fun main(args:Array<String>){
    val carName = car("Audi R8", 2021, 4000.4, 300)
    println("Audi R8 :"+carName.model)
}