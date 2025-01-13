import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

@main

def challenge(): Unit = {
  val usernames = ArrayBuffer("john", "bob", "alice")

  println("Please add your username")
  var usernameInput = StdIn.readLine()

  while (usernames.contains(usernameInput))
    println("Username is already taken, choose another one")
    usernameInput = StdIn.readLine()

  println(s"Welcome $usernameInput")
}
