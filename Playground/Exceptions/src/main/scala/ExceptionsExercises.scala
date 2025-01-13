import scala.io.StdIn

@main
def exceptionExercises(): Unit = {
//  try{
//    val userInput = StdIn.readLine()
//    val convertedNum = userInput.toInt;
//    println(s"${convertedNum * 5}")
//  }catch{
//    case e: Exception => {
//      println("Data passed cannot be multiplied")
//    }
//  }

//  try{
//    println("Please input how many km you ran today")
//    val kmInput = StdIn.readLine()
//    val convertedKm = kmInput.toFloat / 1.609
//    println(s"${convertedKm}")
//  }catch{
//    case e: NumberFormatException => {
//      println("Data passed needs to be a number")
//    }
//    case e: Exception => {
//      println(e.getClass)
//      println("Something went wrong, please try again")
//    }
//  }

  println("What would you like to buy today?")
  val product = StdIn.readLine()
  println(s"How many $product you would like?")
  val quantity = StdIn.readLine()
  try{
    val totalAmount = quantity.toFloat * 9.99
    println(s"Your total is: $totalAmount")
  }catch{
    case e: NumberFormatException => {
      println("Invalid quantity given")
    }
  }





}
