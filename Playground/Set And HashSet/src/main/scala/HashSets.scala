import scala.collection.mutable

@main

def hashSets(): Unit = {
  val values = mutable.HashSet(3,4,true, "hi")
  val noValues = mutable.HashSet[Int]()

  println(values)

  values.add(26)
  println(values)
  values.remove(4)
  println(values)

  values+= 9
  values-= 3

  println(values)

  values.addAll(List(1, 2, 5, 6, 7, 8))
  println(values)
  values += (10, 11)
  values -= (5, 6)
  println(values)

  val colors = mutable.HashSet[String]("red", "green", "yellow")
  colors ++= Set[String]("blue", "galaxy_red")
  println(colors)
  colors --= Set[String]("red", "galaxy_red")
  println(colors)

}
