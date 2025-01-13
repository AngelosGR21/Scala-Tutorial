import scala.collection.mutable

@main
def setFunctions(): Unit = {
  val items = Set(3, 4, true)
//  println(items.size)
//  println(items.contains(4))
//  println(items.contains(5))
//  println(items.isEmpty)
//  println(items.nonEmpty)
//  println(items.head)
//  println(items.tail)

  val numbers = mutable.HashSet(3, 4, null, 83, 56)
  numbers.addOne(150)
//  println(numbers)
  numbers.addAll(List(5, 6, 83))
//  println(numbers)
  numbers.remove(5)
  numbers.subtractOne(150)
  println(s"$numbers << numbers")


  val n2: Set[Int | Null] = Set(4, 5, 6, 7, 8)
  println(s"$n2 << n2")
  println( numbers.intersect(n2)  )
  println( numbers.union(n2) )
  println( numbers.diff(n2) )




}