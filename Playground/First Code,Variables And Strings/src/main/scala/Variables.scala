@main
def Variables(): Unit = {
  var tvShows = "many"
  println(tvShows)
  tvShows = "too many"
  println(tvShows)
  val testVar = "A"
  println(testVar)
  //  testVar = "b" will not work
}