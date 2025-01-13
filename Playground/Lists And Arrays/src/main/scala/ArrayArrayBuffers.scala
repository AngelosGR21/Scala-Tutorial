import scala.collection.mutable.ArrayBuffer

@main
def arrayAndArrayBuffers(): Unit = {
  val a = Array(1, 2, true)

//  println(a)
//  a.foreach(println)
//  println(a.mkString)
//  println(a.toList)

  val b = 0 +: a :+ 25 :+ 33
//  println(b.toList)
  val c = a ++ b
//  println(c.toList)


  val d = ArrayBuffer(1, 2, 3)
  println(d)
  d.addOne(5)
  println(d)
  d.addAll(List(7, 8, 9))
  println(d)
//  d.remove(0)
//  println(d)
  d --= List(1, 8, 3)
  println(d)
}
