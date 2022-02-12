fun main(args:Array<String>){
   println("Please Enter a Lucky Number")

   var x = readLine()!!.toInt()

   when(x) {
       10, 20 -> {
         print("Well wrong try again!")
      }
      in 20..30 -> {
         print("Well you've guessed right")
      }
      !in 30..50 -> {
         print("oops too far!!")
      } else -> {
         print("well out of range, please try again!!")
      }
   }
}