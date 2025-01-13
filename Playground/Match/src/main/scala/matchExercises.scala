import scala.io.StdIn

@main

def matchExercises(): Unit = {
//  1
//  println("Please input how many meals you have per day")
//  val userMeals = StdIn.readInt()
//
//  userMeals match
//    case x if x > 3 => println(s"You should reduce the number of your meals by ${userMeals - 3}")
//    case 3 => println("You are eating the recommended daily amount")
//    case y if 0 to 2 contains y => println(s"You should increase the number of your meals by ${3 - y}")
//    case _ => println("Invalid case")

// 2
//  println("What is your name?")
//  val userName = StdIn.readLine()
//  val firstLetter = userName(0).toLower
//
//  firstLetter match
//    case 'a' | 'b' | 'c' => println("Hi, 3 letters")
//    case y if 'd' to 'h' contains y => println("Hi, 5 letters")
//    case _ => println("Rest of letters")


// 3

  println("Please input your hour of the day")
  val userInput = StdIn.readInt()

//  println(userInput)
//  println(userInput.getClass)


  userInput match
    case x if 6 to 11 contains x => println(s"Morning")
    case y if 12 to 14 contains y => println("Noon")
    case z if 15 to 17 contains z => println("Afternoon")
    case i if 18 to 21 contains i => println("Evening")
    case 22 | 23 | 0 | 1 | 2 | 3 | 4 | 5 => println("Night")
    case _ => println("Invalid hour")






}
