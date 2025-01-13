import scala.io.StdIn

@main

def rangesFunctions(): Unit = {
  val r = 1 to 10 by 2

  println("Guess a number in the range")
//  val guessedInt = StdIn.readInt()

//  if(r.contains(guessedInt))
//    println("Good guess")
//  else
//    println("Try again")


  println(s"Step: ${r.step}")
  println(s"Head: ${r.head}")
  println(s"Tail: ${r.tail}")
  println(s"Last : ${r.last}")
}
