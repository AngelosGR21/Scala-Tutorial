import scala.io.StdIn
import scala.util.Random

@main
def matchSection(): Unit = {
//  println("Type an animal")
//  val input = StdIn.readLine()
//
//  var action = ""
//
//  input match
//    case "dog" => action = "pet it"
//    case "cat" => action = "feed it"
//    case "crocodile" => action = "run away"
//    case _ => action = "google it"
//
//  println(s"When you see a $input you $action")


//  val randomNumber = Random.nextInt(100)
//  randomNumber % 2 match
//    case 0 => println("Number is even")
//    case 1 => println("Number is odd")

  println("Type an animal")
  val input = StdIn.readLine()

  val action = input match
      case "dog" => "pet it"
      case "cat" => "feed it"
      case "crocodile" => "run away"
      case _ => "google it"

  println(s"When you see a $input you $action")
}
