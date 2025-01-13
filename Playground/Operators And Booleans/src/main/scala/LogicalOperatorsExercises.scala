@main
def logicalOperatorsExercise(): Unit = {
  val exerciseA = (5.374 * 9.5847) > (3.237 * 15.3726)
  val exerciseB = (true && false) || (true || false)
  val exerciseC = !((3>=3) && (false || (2>5)))
  println(s"result 1 : $exerciseA")
  println(s"result 2 : $exerciseB")
  println(s"result 3 : $exerciseC")
}
