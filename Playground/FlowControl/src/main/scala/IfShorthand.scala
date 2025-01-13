import scala.io.StdIn

@main

def ifShorthand(): Unit = {
  val number = StdIn.readLine().toInt
  var isEven: String = null

  isEven = if (number % 2 == 0) "Number is even" else "Number is odd"

  isEven = if (number % 2 == 0)
    println("This is a test in the even block")
    "Number is even"
    else
      println("This is a test in the else block (odd)")
      "Number is odd"

  println(isEven)


}
