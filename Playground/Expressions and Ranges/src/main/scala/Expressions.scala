import scala.io.StdIn

@main
def expressions(): Unit = {
  // 1
//  val guestList = List("Alan", "Minnie", "Daniel", "Joe")
//  println("Give your name to the bouncer:")
//  val name = StdIn.readLine()
//
//  if(guestList.contains(name)){
//    println("You're in!")
//  }else
//    println("You're not allowed")

 // 2
// val shelteredAnimals = List()
//
//  if(shelteredAnimals.nonEmpty)
//    println(s"We have the following animals available $shelteredAnimals")
//  else
//    println("Thanks to the community for adopting all animals in need")

  // 3
  println("What is your age?")
  var age = StdIn.readInt()
  age = if (age == 0) then 1 else age

  val stage = if (age >= 18)
    "an adult"
  else if (age < 18 && age >= 13)
    "a teen"
  else if (age < 13)
    "a child"
  else "a monkey"

  println(s"You are $stage")






}
