import scala.io.StdIn

@main
def operatorExercises(): Unit = {
//  val a = 76.254
//  val b = 3.867
//
//  println(s"Addition ${a + b}")
//  println(s"Subtraction ${a - b}")
//  println(s"Multiplication ${a * b}")
//  println(s"Division ${a / b}")
//  println(s"Remainder ${a % b}")

//  val kgMeat = 29.99
//  val thirdOfMeat = kgMeat / 3
//  println(s"Person needs to spend : $thirdOfMeat")


  println("Add amount")
  val amountInAccount = StdIn.readLine()
  val amountLong = amountInAccount.toLong
  val interest = 0.055D
  val amountPerYear = amountLong * interest
  println(s"The user will have ${amountLong + (amountPerYear * 5)} in 5 years")





}
