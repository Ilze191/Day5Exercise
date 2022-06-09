object Maps extends App{

  val myNumbers = (0 to 10).toArray
  println(myNumbers(3))
  println(myNumbers.mkString("*"))

  val myFavorites = Map(("food", "potatoes"),
    ("car", "bmw"),
    ("color", "green"),
    ("shirt", "green"),
    ("salad", "green"))
    println(myFavorites.mkString("    "))

  val anotherMap = Map("cats" -> 5, "dogs" -> 3, "kids" -> 3, "cars" -> 1)
  println(s"I have ${anotherMap("cats")} cats")

  println(myFavorites.contains("food"))
  println(myFavorites.contains("drink"))

  val myKey = "food"
if (myFavorites.contains(myKey)) {
  println(s"Key $myKey -> ${myFavorites(myKey)}")
}
else println(s"Sorry no key $myKey found.")

  val myValue = myFavorites.getOrElse(myKey, "no such key")
println(s"$myKey -> $myValue" )

  //we can iterate/loop through both key and value at the same time
  for ((key, value) <- myFavorites) {
    print(s"My favorite $key is $value \n")
  }

  val myValues =  for ((_, value) <- myFavorites) yield value
  println(s"My values are ${myValues.mkString(",")}")

val myValuesToo = myFavorites.values //the same as above

  val greenMap = for ((key, value) <- myFavorites if (value == "green")) yield (key, value)
  println(greenMap)

  val foodValue = myFavorites.get("food")
  println(foodValue)
 println(myFavorites.get("dessert"))

  val mySeq = Seq(("one", 10), ("two", 20), ("three", 30), ("two", 2020))
  println(mySeq(1))
  val myMap = mySeq.toMap
  println(mySeq)
  println(myMap)



val squareMap = (for (n <- myNumbers) yield (s"Number $n squared", n*n)).toMap
  println(squareMap)
  val squareArray = myNumbers.map(n=>(s"Number $n squared", n*n))
  val squareMapAgain = squareArray.toMap

}