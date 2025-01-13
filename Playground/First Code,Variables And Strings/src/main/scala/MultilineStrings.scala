@main
def multilineStrings(): Unit = {
//  val str1 = "This is a \nmultiline\nstring"
//  println(str1)
  val str2 =
    """This
      |Is
      |some weird multiline
      |structure
      |""".stripMargin

  println(str2)
}
