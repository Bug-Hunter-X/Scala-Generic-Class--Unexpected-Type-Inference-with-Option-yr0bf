```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject extends App {
  val myInt = new MyClass(10)
  myInt.printValue() // This works fine

  val myString = new MyClass("hello")
  myString.printValue() // This also works fine

  val myList = new MyClass(List(1, 2, 3))
  myList.printValue() // This will print List(1, 2, 3)

  val myOption = new MyClass(Some(10))
  myOption.printValue() // This will print Some(10)
}
```