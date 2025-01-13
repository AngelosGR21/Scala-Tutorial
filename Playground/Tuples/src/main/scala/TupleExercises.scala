@main

def tupleExercises(): Unit = {
  val userInfo = ("Alex", "alex@gmail.com", 273615)

  println(s"${userInfo(0)} : ${userInfo._3}")

  val newTup = userInfo.copy(_2 = 350)

//  println(newTup)


  val stores = (("Downtown", 36253), ("West side", 27362), ("East side", 29483))

  println(s"Total revenue from all stores: ${stores._1._2 + stores._2._2 + stores._3._2}")
  val storeNames = (stores._1._1, stores._2._1, stores._3._1)
  println(storeNames)



}
