import scala.io.StdIn

@main

def moreForLoopExercises(): Unit = {
//  println("Please input a number")
//  val maxValue = StdIn.readInt()

//  for(i <- 1 to maxValue; if i % 7 == 0; if i != maxValue)
//    println(i)

//  for(x <- 1 to 10)
//    val emoji = "\uD83D\uDE00"
//    println(emoji * x)
    
  for(x <- 1 to 10)
    val emoji = "\uD83D\uDE00"
    for(j <- 1 to x)
      print(emoji)
    println()  
}
