// In scala operators are functions/methods in their own rights. This is done using dot operator (i.e  .+, .-)

val num1 = 23
val num2 = 24
val num3 = num1 .+(num2)

// class initialization in the class definition itself. 
// methods inside class

object ex {
case class Student(var rollno: Int = 1, var name: String = "Girish, var marks: Int = 90) {
  def show =  prinln("this is a method inside class Student") 
}

var s1 = Student()
// Pass the arguments using the object 
var s2 = Student(2,"Santhosh",85)
s1.show()

//Operator overloading in Scala, where the in-built scala operaor needs to be defined in our own custom class before using 
them on the objects defining the class.

case class Student(var rollno: Int = 1, var name: String = "Girish, var marks: Int = 90) {
  // Overloading .> operator inside our own custom class
  def .>(s2: Student): Boolean = marks > s2.marks
}

var s1 = Student()
var s2 = Student(2,"Santhosh",85)
s1 .> s2

// List

var l = List(2,3,5,4)
for (n <- l) { println(n) }
l.foreach { i:Int => println(i) }
var l_rev = l.reverse

//Arrays
var l = Array(6,3,5,2)

//Scala sets are immutable and does not preseve any order
var l =  Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
