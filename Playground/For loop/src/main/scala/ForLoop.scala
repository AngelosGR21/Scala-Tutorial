@main

def forLoop(): Unit = {
  val collection = List(1,2,3)

//  for(x <- collection)
//    println(x)

  val animals = List("Cat", "Dog", "Mouse", "Horse")
//  for (animal <- animals)
//    println(s"Feeding the $animal")

//  for(i <- 1 to 12)
//    val month = i match
//      case 1 => "January"
//      case 2 => "February"
//      case 3 => "March"
//      case 4 => "April"
//      case 5 => "May"
//      case 6 => "June"
//      case 7 => "July"
//      case 8 => "August"
//      case 9 => "September"
//      case 10 => "October"
//      case 11 => "November"
//      case 12 => "December"
//      case _ => "Something went wrong"
//
//    println(s"Month #$i is called $month")

//  for(row <- 1 to 5; column <- 3 to 9)
//    println(s"x = $row, y = $column")

  for(row <- 1 to 5)
    for(column <- 1 to 5)
      print(s"$row, $column\t")
    println()
}