@main
def StringExercises(): Unit = {
  // Print length of a variable
  val catName = "My cat's name is \"Fluffy\""
  println(s"${catName.length} length of the catName variable")
  // Extract string car from the following variable
  val myCar = "My car won't start";
  println(myCar.substring(3, 6))
  // Print a personalized message for that customer to the console
  val clientName = "John"
  println(s"Hello $clientName")
  // Given 2 number variables, print to the console the amount of fruits available
  val apples = 3
  val oranges = 6
  println(s"Total number of fruits available ${apples + oranges}")
  println(clientName.contains("John"))
}