import scala.io.StdIn

@main
def userInputExercises(): Unit = {
  //Ask the user for their name and print a personalized greeting
//  println("What's your name?")
//  val userName = StdIn.readLine();
//  println(s"Hey there $userName!!")
  // Ask the user for a number and prints out the number multiplied by 5
//  println("Type a number")
//  val number = StdIn.readLine().toInt
//  println(s"Your number multiplied by 5 : ${number * 5}")
  // Ask user for their birth year and print out their estimated age
  println("Insert your birth year")
  val birthYear = StdIn.readLine().toInt
  println(s"Your age is ${2024 - birthYear}")
}
