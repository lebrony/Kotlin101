import java.lang.reflect.Array.get

class Car(){
    var type:String?=null
    var model:Int?=null
    var Horsepower:Double?=null
    var Speed:Int?=null

    constructor(name: String, model:Int, Horsepower:Double, Speed:Int) : this(){
        this.type = name
        this.model = model
        this.Horsepower = Horsepower
        this.Speed = Speed
    }


    init {
        println("name :$type")
        println("Model :$model")
        println("Horsepower :$Horsepower")
        println("Speed :$Speed")
    }
}

fun main(args:Array<String>){
    val carName = car("Audi R8", 2021, 4000.4, 300)
    println("Audi R8 :"+carName.model)
}