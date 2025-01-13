@main
def lists(): Unit = {
  val l = List(1, 2, 3, 2 ,5)
//  println(l)
//
  val m = List(1, true, "hello")
//  println(m)
//
  val n = List()
  val o = Nil
//  println(n)
//  println(o)

  val a = List[Int](1, 2, 3)
//  val p = List[Int](1, 2, true) //error
  val matrix = List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )

//  println(matrix)
//  println(matrix(0)(1))


  val fruits = List("apples", "bananas", "pineapples")
//  println(fruits(1))
  println(fruits.head)
  println(fruits.tail)
  println(fruits.length)

}
