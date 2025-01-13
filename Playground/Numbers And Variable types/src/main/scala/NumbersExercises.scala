import scala.io.StdIn

@main
def numbersExercises(): Unit = {
  // create an int variable and print it's class
  val num = 3
//  println(num.getClass)
  // create a float variable and print it's class
  val flNum = 3.22F
//  println(flNum.getClass)


  // extra

  println("Input a number")
  val number = StdIn.readLine().toInt;
  val someDouble = 5.99
  val result = number * someDouble
  println(s"Multiplied ($number * $someDouble) = ${result} with type ${result.getClass}")



}
