import scala.io.StdIn

@main

def rangeExercises(): Unit = {
// 1
  val divisibleRange = 0 to 1000 by 17
//  println(divisibleRange.toList)

// 2
//  println("How many cats do you have?")
//  val userCats = StdIn.readInt()
//  val catR = 1 to userCats
//  val totalCats = catR.length
//
//  if(totalCats > 7)
//    println("Many cats")
//  else if (totalCats > 4 && totalCats <= 6)
//    println("Several cats")
//  else if (totalCats > 1 && totalCats <= 3)
//    println("Few cats")
//  else
//    println("No cats")

  println("Please enter the month you would like to see (1-12)")

  var month = StdIn.readInt()
  val waterFrequency = 3

  if(month < 1 || month > 12)
    month = 1

  val days = if (month == 2)
    28
  else if (List(4, 6, 9,11).contains(month))
    30
  else
    31

  val daysRange = 1 to days by waterFrequency

  println(s"For the month number $month, you have to water" +
    s"the plants ${daysRange.length} days")



}