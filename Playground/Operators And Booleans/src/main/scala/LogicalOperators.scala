@main
def logicalOperators(): Unit = {
  println(s"And operator && ${true && true} << true && true")
  println(s"And operator && ${true && false} << true && false")

  println(s"Or operator || ${true || true} << true || true")
  println(s"Or operator || ${true || false} << true || false")

  println(s"Negation operator ! ${!true} << !true")
  println(s"Negation operator ! ${!false} << !false")
}
