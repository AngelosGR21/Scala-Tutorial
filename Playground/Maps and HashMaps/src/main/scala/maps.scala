@main
def maps(): Unit = {
    val count = Map(1 -> "one", 2 -> "two", 3 -> "three")
    val count2 = Map((1, "one"), (2, "two"), (3, "three"))
    val count3: Map[Int, String] = Map(1 -> "one", 2 -> "two")

//    println(count3(1))
    println(count3.keys)
    println(count3.keySet)
    println(count3.values)
}
