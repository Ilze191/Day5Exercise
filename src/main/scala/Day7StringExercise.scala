object Day7StringExercise extends App{
  //TODO
  def processString(text: String, uppercaseChars: String = "", needsTrim: Boolean = false): String = {
    //TODO first trim string if it needs trimming from the argument
    //TODO replace All characters in uppercaseChars with their uppercase versions
    //you will need to write a loop
    //you will probably want to use var to store a temporary string that you keep reweriting
    //return newly created string

    val trimmedString = if (needsTrim) text.trim else text

    var newString = "" //I start with an empty string and build it up
    for (c <- trimmedString ){
      if (uppercaseChars.contains(c)) {
        newString += c.toUpper //building up a new string one character at a time
      }
      else {
        newString += c
      }
    }

    newString
  }

  println(processString("abracadabra", "cr")) //should print abRaCadabRa
  println(processString("   abracadabra  ", "cr", needsTrim = true)) //should print abRaCadabRa
}
