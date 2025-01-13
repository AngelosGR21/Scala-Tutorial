import scala.collection.mutable

@main

def mapExercises(): Unit = {
  val count = mutable.HashMap(1 -> "un", 2 -> "deux", 3 -> "trois")

//  println(count(2))
//  println(count(3))
//  count += (4 -> "quatre")
//  println(count)

  val customers = mutable.HashMap("John" -> 1, "Alice" -> 5, "Bob" -> 3)
  val doesAliceExist = customers.contains("Alice")
//  if(doesAliceExist){
//    println(customers("Alice"))
//  }

//  println(customers.contains("Michael"))

  val attendance = mutable.HashMap("23/09" -> 3726, "24/09" -> 4735, "25/09" -> 2836)

  attendance+= ("26/09" -> 3452)

  val total = attendance("25/09") + attendance("26/09")
  println(s"Total number of attendants on 25th and 26th of September: $total")

  println(attendance.contains("22/09"))














}
