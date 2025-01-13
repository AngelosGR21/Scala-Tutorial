@main

def tuplesFunction(): Unit = {
  val conn = (80, "www", "google.com", true)
  val conn2 = Tuple4(80, "www", "google.com", true)

  println(conn.toString())
  val conn3 = conn.copy(_2 = "ftp")
  println(conn3)

  println(conn3.productArity)

  val conn4 = ("abc", 123)
  println(conn4.swap)

  val info = ("auth", "cache")
  println(conn ++ info)



}
