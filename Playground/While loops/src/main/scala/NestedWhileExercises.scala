import scala.io.StdIn

@main

def nestedWhileLoops(): Unit = {
  var number = 0
//  while(number <= 100)
//    println("Please input a number larger than 100")
//    number = StdIn.readInt()

  var userNum = 0
  var factorialNum = 1L
  while(factorialNum < 3_000_000L)
    println("Please input a number")
    userNum = StdIn.readInt()

    factorialNum = 1
    var modifiableNum = 1
    while(modifiableNum <= userNum)
      factorialNum *= modifiableNum
      modifiableNum += 1

    println(s"$factorialNum your factorial")
}
