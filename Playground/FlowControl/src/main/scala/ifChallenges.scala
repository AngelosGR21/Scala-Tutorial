import scala.io.StdIn

@main

def ifChallenge(): Unit = {
  val eggPrice = 5
  val baconPackPrice = 20

  var hasEggs = false
  var hasBacon = false

  println("Does the market have eggs?")
  hasEggs = StdIn.readLine() == "yes"
  println("Does the market have bacon?")
  hasBacon = StdIn.readLine() == "yes"
  var totalSpend = 0;
  if hasEggs then
    totalSpend = 12 * eggPrice
    if hasBacon then totalSpend += baconPackPrice * 2

  println(s"Total payment: $totalSpend")

}
