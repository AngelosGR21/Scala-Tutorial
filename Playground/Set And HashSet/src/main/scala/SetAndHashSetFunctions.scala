import scala.collection.mutable

@main
def setAndHashSetFunctions(): Unit = {
  val primes = Set(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
//  println(primes.contains(21))
//  println(primes.contains(13))

  val myDrinks = Set("water", "coke", "beer", "orange juice")
  val theirDrinks = Set("water", "orange juice", "pineapple juice", "milk")

//  println(myDrinks.intersect(theirDrinks))

  val acceptedColors = mutable.HashSet("white", "black", "gray")
  val myColors = Set("blue", "red", "black", "green")

  println(s"Colors I can wear are : ${acceptedColors.intersect(myColors)}")
  println(s"Colors I cannot wear : ${myColors.diff(acceptedColors)}")
  acceptedColors.addOne("red")
  println(s"Colors I can wear are : ${acceptedColors.intersect(myColors)}")
  println(s"Colors I cannot wear : ${myColors.diff(acceptedColors)}")






}
