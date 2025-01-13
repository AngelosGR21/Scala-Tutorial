@main

def mapFunctions(): Unit = {
  val count = Map(1 -> "one", 2 -> "two", 3 -> "three", "test" -> 5)

  println(count.size)
  println(count.contains(3))
  println(count.contains("testinggg"))

  println(count.head)
  println(count.tail)

  println(count.isEmpty)

  println(count(1))

  println(count.values)

}
