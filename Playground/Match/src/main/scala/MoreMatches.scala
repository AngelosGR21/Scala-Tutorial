import scala.io.StdIn

@main

def moreMatches(): Unit = {
//  println("Type an animal")
//  val input = StdIn.readLine()
//
//  val action = input match
//    case "dog" | "hamster" => "pet it"
//    case "cat" => "feed it"
//    case "crocodile" => "run away"
//    case _ => "google it"
//
//  println(s"When you see a $input you $action")

//  val numbers = List(1,3,2)
//  numbers match
//    case List(1,2,3) => println("single digits")
//    case List(10,11,12) => println("double digits")
//    case _ => println("unknown")


  val animalFeed = ("cat", "catFood")

  animalFeed match
    case ("cat", _) => println("cat info")
    case ("dog", _) => println("dog info")
    case _ => println("random tuple")

  
}
