@main
def listFunction(): Unit = {
  val colors = List("red", "green", "white", "blue", "white")

  println(colors.isEmpty)
  println(colors.length)

  println(colors.contains("red"))
  println(colors.contains("pink"))

  println(colors.indexOf("red"))
  println(colors.indexOf("white"))
  println(colors.lastIndexOf("white"))
}