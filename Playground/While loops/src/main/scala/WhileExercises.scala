import scala.io.StdIn

@main

def whileExercises(): Unit = {
  var i = 0;
//  while (i < 10)
//    println("Hey there")
//    i+= 1

  val cats = List("Tiger", "Smokey", "Sassy", "Patch", "Sammy")

//  while( i < cats.length)
//    println(s"Hello, ${cats(i)}!")
//    i+= 1

  println("Input a number for the factorial")
  val factorialNum = StdIn.readInt()
  var f = 1
  var total = 1
  while(f <= factorialNum)
    total *= f
    f += 1

  println(total)
}
