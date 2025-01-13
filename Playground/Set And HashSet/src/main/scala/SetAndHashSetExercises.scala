import scala.collection.mutable

@main
def setAndHashSetExercises(): Unit = {
  val colors = mutable.HashSet[String]()
  colors += ("yellow", "green", "red")
  colors -= "red"
  println(colors)

  val deskObjects = mutable.HashSet[String]("monitor stand", "water jug", "mouth guard", "rubber duck")
  val removableDeskObjects = Set[String]("water jug", "mouth guard")
  deskObjects --= removableDeskObjects

  println(deskObjects)


  val customers = mutable.HashSet[String]("Alex", "Diana", "Raul")
  customers += "Zooma"
  println(customers)
  customers -= "Alex"
  println(customers)

}