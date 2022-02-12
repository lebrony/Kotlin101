fun main(args:Array<String>){
    loop@ for (item in 1..10){
        for (item2 in 1..5){
            if (item2 == 4){
                break@loop
            }
        }
    }
}