import scala.io.StdIn

@main
def typeConversionExercises(): Unit = {
  // ask user for a number and read the input,
  // convert the value into different number types
//  println("Input a number :")
//  val numberInput = StdIn.readLine()
//  println(s"Number converted to Byte : ${numberInput.toByte}")
//  println(s"Number converted to Short : ${numberInput.toShort}")
//  println(s"Number converted to Int : ${numberInput.toInt}")
//  println(s"Number converted to Long : ${numberInput.toLong}")
//  println(s"Number converted to Float : ${numberInput.toFloat}")
//  println(s"Number converted to Double : ${numberInput.toDouble}")

  // Ask user for a double and multiply it by pi
  println("Input a double number type")
  val doubleNum = StdIn.readLine().toDouble
  val longPi: Double = 3.141592653589793
  val result = doubleNum * longPi
  println(s"$doubleNum * $longPi = $result with type ${result.getClass}")
}
