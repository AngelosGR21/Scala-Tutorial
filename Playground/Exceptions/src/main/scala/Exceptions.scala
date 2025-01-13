import scala.io.StdIn

@main
def exceptions(): Unit = {
  val input = StdIn.readLine()

//  throw IllegalStateException("Just some random message")

  try{
    val number = input.toInt
  }catch{
    case f: NumberFormatException => {
      println("Number format exception occurred")
    // f.printStackTrace()
    }
    case e: Exception => {
      println("Exception occurred")
    }
  }finally{
    println("Execution completed")
  }

  println("Continue execution")

}
