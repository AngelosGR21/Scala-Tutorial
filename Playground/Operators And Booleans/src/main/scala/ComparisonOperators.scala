@main
def comparisonOperators(): Unit = {
  val a = 5
  val b = 1
  val c = 5
  println(s"a > b = ${a > b}")
  println(s"a < b = ${a < b}")
  println(s"a >= c = ${a >= c}")
  println(s"a <= c = ${a <= c}")

  println(s"a == c = ${a == c}")
  println(s"a != c = ${a != c}")

}
