object ObjectOrient extends App {
 //class and instance
  class Animal {
   //define fields
   val age = 0
   //define methods
   def eat() = println("I am eating")
 }
  val anAnimal= new Animal
  //inheritance
  class Dog(name: String) extends Animal
  val aDog = new Dog("Lassie")
//subtype polimorphism
val aDeclaredAnimal: Animal = new Dog("Hatchie")
aDeclaredAnimal.eat()

  // abstract class
  abstract class WalkingAnimal {
    val hasLegs = true // by default public, can restrict by adding protected or private
    def walk(): Unit
  }

  // "interface" = ultimate abstract type
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait Philosopher {
    def ?!(thought: String): Unit // valid method name
  }
class Crocodile extends Animal with Carnivore {
  override def eat(animal: Animal):Unit = println("I am eating you Animal")
}
val aCroc = new Crocodile
aCroc.eat(aDog) //object , method, argument

  val aDinosaur = new Carnivore {
    override def eat(animal: Animal): Unit = println("I am a dinosaur so I can eat pretty much everything")
  }

}
