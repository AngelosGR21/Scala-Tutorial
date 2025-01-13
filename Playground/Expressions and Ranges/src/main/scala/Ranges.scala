@main
def ranges(): Unit = {
  val r1 = 1 to 10
  println(r1.toList)

  val r2 = 'a' to 'z'
//  println(r2.toList)

  val r3 = 1 until 10
//  println(r3.toList)

  val r4 = 1 to 10 by 2
//  println(r4.toList)

  val r5 = Range(1, 10)
//  println(r5.toList)

  val r6 = Range.inclusive(1, 10)
//  println(r6.toList)

  val r7 = 10 to 1 by -2
  println(r7.toList)
  println(r7.reverse.toList)
}
