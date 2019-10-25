##variable and constants declaration
var name = "girish" (variable)
val name = 34  (constant)

Variables are mutable whereas constants are not mutable

##if else is similar to C/Java

if (name == "girish") {
  println ("name is correct")
} else {
  println ("name is incorrect")
}

##It has list data type which is declared using List method in the library
var list1 = List(1,2,3)

##methods/functions in scala declared using keyword "def". While passing arguments to functions, we need to specify argument name, type and return type.
def distance(x: Int, y: Int, returnPositive: Boolean): Int = {
    val xy = x * y
    if (returnPositive) xy.abs else -xy.abs
}

##parameters of the method are passed along with parameter name (i.e in the example below, the parameter name count,wrap and wrapValue are specified during passing the value to the function)

def myMethod(count: Int, wrap: Boolean, wrapValue: Int = 24): Unit = { ... }
myMethod(count = 10, wrap = false, wrapValue = 23)



##functions can be overloaded (i.e same function name with different functionalities), but overloading is not advisable
def times2(x: Int): Int = 2 * x
def times2(x: String): Int = 2 * x.toInt

##Recursive and nested functions
def asciiTriangle(rows: Int) {
    
    // This is cute: multiplying "X" makes a string with many copies of "X"
    def printRow(columns: Int): Unit = println("X" * columns)
    
    if(rows > 0) {
        printRow(rows)
        asciiTriangle(rows - 1) // Here is the recursive call
    }
}

// printRow(1) // This would not work, since we're calling printRow outside its scope
asciiTriangle(6)

##for statement is similar to many other language, where you can iterate the range of values
for (i <- 0 to 10) { println(i) }

##use 'until to omit the final value
for (i <- 0 to 10) { println(i) }   ; this will print from only 0 to 9

##packages and classes are imported using "import keyword". 
import tool1.tool2 ; this means tool2 is a class inside the package tool1

####Scala is an object oriented language like C++ and java and Classes are an important part of OOP. 
##Class is declared using keyword class and object is created to specify the instance of the class.
##Class is an abstract which contains variables and methods.
##Class can extend other classes (i.e have a super class and subclass) and subclass can selectively (or completely) inherit the properties of superclass.
##Class can have parameters passed directly to it instead of passing through methods/constructor.

class WrapCounter(counterBits: Int) {

  val max: Long = (1 << counterBits) - 1
  var counter = 0L
    
  def inc(): Long = {
    counter = counter + 1
    if (counter > max) {
        counter = 0
    }
    counter ( this final line in the method is the return parameter)
  }
  println(s"counter created with max value $max")
}

##instance of the class is created using new keyword
val x = new WrapCounter(2)
