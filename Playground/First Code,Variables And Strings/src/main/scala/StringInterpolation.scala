@main
def stringInterpolation(): Unit = {
  val dogName = "Rex"
  println(s"My dog's name is $dogName")
  //Expressions
  println(s"I have ${1 + 1} cats")
  println(raw"This is a raw \n \\newline")
}
