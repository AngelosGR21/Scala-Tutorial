import scala.collection.mutable

@main
def hashMaps(): Unit = {
  val count = mutable.HashMap[Int, String](1 -> "one", 2 -> "two", 3 -> "three")
  println(count)
  count += (4 -> "four")
  println(count)
  count.addOne((5 -> "five"))
  println(count)


  count ++= Map(10 -> "ten", 11 -> "eleven")
  println(count)
  count.addAll(Map(12 -> "twelve", 13 -> "thirteen"))
  println(count)
  count -= 13
  println(count)
  count --= Set(12, 11, 10)
  println(count)
  count.remove(5)
  println(count)

  count(4) = "updated four"
  println(count)

  count.clear()
  println(count)


}