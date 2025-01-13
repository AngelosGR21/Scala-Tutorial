import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

@main
def listsAndArraysExercises(): Unit = {
//  val favouriteAnimals: List[String] = List("Dog", "Polar Bear", "Raccoon", "Cat")
//  println(s"I have ${favouriteAnimals.length} animals in my list")
//  println(favouriteAnimals(1))

//  val customers = ArrayBuffer("Dan", "Francis", "Robert")
//  println(s"Our current customers $customers")
//  println("Please add a customer : ")
//  val addedCustomer = StdIn.readLine()
//  customers.addOne(addedCustomer)
//  println(s"$customers, added $addedCustomer")
//  println("Type who you would like to remove")
//  val removeCustomer = StdIn.readLine()
//  val indexLeavingCustomer = customers.indexOf(removeCustomer)
//  customers.remove(indexLeavingCustomer)
//  //  customers -= removeCustomer
//  println(s"$customers, removed $removeCustomer")

  val items = ArrayBuffer("laptop", "mouse", "pen", "paper", "mug", "phone")
  println(items)
  val removedItems = ArrayBuffer("pen", "paper", "mug", "phone")
  items --= removedItems
  println(items)

}