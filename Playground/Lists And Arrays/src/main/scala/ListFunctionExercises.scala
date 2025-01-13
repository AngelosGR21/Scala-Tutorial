import scala.collection.mutable.ArrayBuffer

@main
def listFunctionExercises(): Unit = {
//  val winners = List("Usain", "John", "Michael", "Alex", "Bob")
//  println(s"Michael finished ${winners.indexOf("Michael") + 1}")

//  val availableColors = List("red", "blue")
//  val canPrint = availableColors.contains("red") && availableColors.contains("blue") && availableColors.contains("green")
//  println(s"Can the printer print? : $canPrint")

//  val recipeIngredients = ArrayBuffer("Chicken", "Egg", "Mozzarella", "Pepper")
//  println(recipeIngredients)
//  recipeIngredients(2) = "Blue Cheese"
//  println(recipeIngredients)
//  recipeIngredients.addOne("Salt")
//  println(recipeIngredients)

  val animals = ArrayBuffer("lion", "zebra", "chimp", "elephant")
  println(animals)
  animals.addOne("bear cub")
  println(animals)
  val lionIndex = animals.indexOf("lion")
  animals.remove(lionIndex)
  println(animals)
  val containsElephants = animals.contains("elephant")
  val containsGiraffes = animals.contains("giraffes")
  println(s"Does the zoo contain elephants and giraffes? : ${containsGiraffes && containsElephants} ")

}
