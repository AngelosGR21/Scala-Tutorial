import scala.io.StdIn

@main
def conditionals(): Unit = {
//  val test = false
//  if(test)
//    println("In if")
//  else
//    println("In else")

val userFunds = StdIn.readLine().toFloat
val price = 10.99

 if(userFunds >= price)
    println("You can purchase the item")
 else
    println("Insufficient funds")

}
