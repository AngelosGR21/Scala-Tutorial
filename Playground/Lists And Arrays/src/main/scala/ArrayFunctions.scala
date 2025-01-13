import scala.collection.mutable.ArrayBuffer

@main
def arrayFunctions(): Unit = {
  val colors = Array("red", "green", "white", "blue", "white")
//  println(colors.toList)
//  colors(1) = "pink"
//  println(colors.toList)
//  colors.update(2, "black")
//  println(colors.toList)

  val colorsBuffer = ArrayBuffer("red", "green", "white")
  println(colorsBuffer)
  colorsBuffer.addOne("yellow")
  println(colorsBuffer)
  colorsBuffer.addAll(List("magenta", "orange", "transparent"))
  println(colorsBuffer)
//  colorsBuffer.remove(0)
//  println(colorsBuffer)
//  colorsBuffer.remove(0, 2)
//  println(colorsBuffer)
  colorsBuffer.insert(1, "inserted")
  println(colorsBuffer)
  colorsBuffer.insertAll(4, List("a", "b"))
  println(colorsBuffer)
  colorsBuffer.clear();
  println(colorsBuffer)

}
