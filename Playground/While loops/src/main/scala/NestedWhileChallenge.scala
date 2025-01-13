import scala.io.StdIn

@main

def nestedChallenge(): Unit = {

  var number = 1L;
  while(number != 0)
    println("Please input a long number")
    number = StdIn.readLong()
    var i = 0

    while(i <= number)
      if(i % 17 == 0)
        print(s"$i\t")
      i+= 1

    println()
}
