@main
def stringFunctions(): Unit = {
  val myPet = "Crocodile"
  println(myPet.length)

  val myName = "michelle"
  println(myName.capitalize)
  val myAnimal = "GIRAFFE"
  println(myAnimal.toLowerCase)

  // Accessing index of a string
  var indexAccess = myPet(2)
  indexAccess = myPet.charAt(2)
  println(indexAccess)

  
}