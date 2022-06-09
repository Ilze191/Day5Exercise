/**
 * the most simple class definition
 */
class PlainHouse

/**
 *
 * @param name - house name
 * @param levels - how many stories are in the house
 */
class House(var name:String,
            val levels:Int,
            var material:String = "Brick",
            val floorHeight:Double = 2.8,
            val width:Double = 4,
            val houseLenght:Double = 3.7) {
  println("starting construction")

  val volume = levels*floorHeight*width*houseLenght
  var age = 0 //so we can change the age later

  def yearsPass(years:Int) = {
    age+=years
  }
  private var securityKey = ""
  var publicKey = "My public key"
  //contructor block - it will run when the object is created from this class blueprint

  private def generateHash(plainText: String):String ={
    "hash" + plainText + "my_salt"
  }

  def updateSecurityKey(password:String) ={
    securityKey = generateHash(password)
  }

  def retrieveSecurityKey(password: String):String = {
    if (password == "hunter2") securityKey else "No Acess"
  }
  def prettyPrint(): Unit = {
    println(s"Cool our house is called $name and it has $levels stories and it is made of $material")
  }
  override def toString:String = {
    s"Neat our house is called $name and it has $levels stories and it is made of $material"
  }
}


object Classes extends App{

  val myPlainhouse = new PlainHouse //this creates an object out of PlainHouse blueprint
  println(myPlainhouse)
  val anotherPlainhouse = new PlainHouse //2nd object of Plainhouse blueprint

  val myHouse = new House("countryHouse", 2)
  myHouse.prettyPrint()
  println(myHouse)
  println(myHouse.name) //we can GET values/fields/data out of objects using . notation
  println(myHouse.levels)
  myHouse.name = "myCountryCastle" //i can SET fields if they were defined in the blueporiny with var
  println(myHouse.name)

  val anotherHouse = new House("cityHouse", 5)
  anotherHouse.prettyPrint()

  val strawHouse = new House("piggueHouse", 1,"Straw", houseLenght = 3.2)
  strawHouse.prettyPrint()
  println(strawHouse.age)
  strawHouse.age +=5
  println(strawHouse.age)

  strawHouse.updateSecurityKey("mypassword")
  println(strawHouse.retrieveSecurityKey("hunter2"))
  println(strawHouse.retrieveSecurityKey("notmypassword"))
println(s"Strawhouse volume is ${strawHouse.volume}")





}
