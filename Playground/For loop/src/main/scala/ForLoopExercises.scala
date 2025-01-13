import scala.collection.mutable
import scala.io.StdIn

@main

def forLoopExercises(): Unit = {
//  1
//  for(x <- 1 to 10)
//    println(s"Greetings $x")

// 2
//  var total = 0
//
//  for(i <- 1 to 100)
//    total += i
//
//  println(total)


// 3
//  val customers = Map("Alice" -> 4, "Judy" -> 8, "Anna" -> 6)
//  for(customerName <- customers.keys)
//    println(s"Hi ${customerName}, you've made ${customers(customerName)} purchases so far")


// 4
  println("Please input a year")
  val userYear = StdIn.readInt()
  val daysOfEachMonth = mutable.HashMap(
    "January" -> 31,
    "February" -> 28,
    "March" -> 31,
    "April" -> 30,
    "May" -> 31,
    "June" -> 30,
    "July" -> 31,
    "August" -> 31,
    "September" -> 30,
    "October" -> 31,
    "November" -> 30,
    "December" -> 31
  )

  println(5 % 2 == 0)

  for(year <- 1 to userYear) {
    year match
      case x if year % 4 == 0 =>
        val clonedMonths = daysOfEachMonth.clone()
        clonedMonths("January") = 29
        println(s"$clonedMonths << leap year")
      case _ => println(s"$daysOfEachMonth << non leap year")
  }
}
