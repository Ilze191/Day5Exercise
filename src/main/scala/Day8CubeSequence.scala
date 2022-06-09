import scala.io.StdIn.readLine

object Day8CubeSequence extends App {
  //TODO ask user for starting number
  //TODO ask user for ending numbers
  //Calculate cubes of these integers including start and end AND store results in a sequence
  //Print the saved sequence on screen

  //extra challenge save odd cubes and print them
  val startNumber = readLine("Please enter starting number: ").toInt
  val endNumber = readLine("Please enter ending number: ").toInt
  val numbers = (startNumber to endNumber).toList
  println(numbers)
  val cubes = for (number <- numbers) yield Math.pow(number, 3).toInt
  println(s"cubes of those numbers are $cubes")
  val oddCubes = for(number <- cubes if number % 2==0) yield number
  println(s"odd cubes of those numbers are $oddCubes")





}
