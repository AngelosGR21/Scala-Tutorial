@main

def moreForLoops(): Unit = {
//  for (row <- 1 to 5)
//    for (column <- 1 to 5)
//      print(s"$row, $column\t")
//    println()

  val clients = List("Alice", "Bob", "Carol", "Britney", "Tom")

  for (client <- clients if client.length > 4)
    println(client)

  println("-----------------------")

  for(client <- clients if client.length > 4; if client.toLowerCase().contains('a'))
    println(client)


  println("-----------------------")

  val output = for (client <- clients if client.length > 4)
    yield client
  println(output)

}
