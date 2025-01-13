import scala.io.StdIn

@main
def conditionalExercises(): Unit = {
// 1
//  println("Do you have your car key with you?")
//  val keyUserResponse = StdIn.readLine()
//  val hasKey = keyUserResponse == "yes"
//
//
//  if hasKey then
//    println("Would you like to enter and start the car?")
//    val entersCar = StdIn.readLine().toBoolean
//    if entersCar then
//      println("Starts car!")
//    else
//      println("Walks away...")
//  else
//    println("Forgot your keys! :(")

// 2
//println("Please input your current time, only the hour")
//val userTime = StdIn.readLine().toInt
//
//  if userTime > 12 then
//    println(s"${userTime - 12}pm")
//  else
//    println(s"$userTime am")

// 3
//    println("Input an integer")
//    val userInt: Int = StdIn.readInt()
//
//    val message = if userInt > 0 && userInt < 9 then "Number is a single digit" else "Number is not a single digit"
//
//    println(message)

// 4

//val response = 800.toString
//    if(response.startsWith("1"))
//      println("Information response")
//    else if(response.startsWith("2"))
//      println("Success")
//    else if(response.startsWith("3"))
//      println("Redirect")
//    else if(response.startsWith("4"))
//      println("Client error")
//    else if(response.startsWith("5"))
//      println("Server error")
//    else
//      println("Invalid response")

// 5

  println("Please input the student's grade")
  val grade = StdIn.readInt()

  if(grade >= 90 && grade <= 100)
    println("Grade A")
  else if(grade >= 80 && grade <= 89)
    println("Grade B")
  else if(grade >= 70 && grade <= 79)
    println("Grade C")
  else if(grade >= 60 && grade <= 69)
    println("Grade D")
  else if(grade >= 50 && grade <= 59)
    println("Grade E")
  else
    println("Grade F")






}
