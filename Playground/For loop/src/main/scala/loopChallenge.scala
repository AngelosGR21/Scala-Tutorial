import scala.io.StdIn

@main

def loopChallenge(): Unit = {
  println("Please input a number")
  val userNum = StdIn.readInt()

  for(row <- 1 to userNum)
    for(column <- 1 to userNum)
      val sum = row + column
      val emoji = sum % 3 match
        case 0 => "\uD83D\uDE00\t"
        case 1 => "\uD83E\uDD28\t"
        case 2 => "\uD83D\uDE31\t"
      print(emoji)
    println()


}
