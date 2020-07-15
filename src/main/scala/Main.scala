package main.scala
import scala.language.implicitConversions
object Main
{
  def main(args: Array[String]): Unit =
  {
    // Task 1
    val numberList : List[Int] = List.range(50, 101)
    println("Task 1: ")
    println(numberList)
    println(" ")

    // Task 2
    val setOne : List[Int] = List(11, 13, 15, 20, 10)
    val setTwo : List[Int] = List(10, 7, 8, 19, 10)
    println("Task 2:")
    println("Data Structures")
    println("First Data Structure: " + setOne)
    println("Second Data Structure: " + setTwo)
    println(" ")

    // Print Duplicates
    println("Values that exists in both data structures:")
    println(setOne.filter(x => setTwo.contains(x)))
    println(" ")

    // Print difference
    println("Values not in the second data structure:")
    println(setOne.filterNot(setTwo.contains(_)))
    println("Values not in the first data structure:")
    println(setTwo.filterNot(setOne.contains(_)))
    println(" ")

    // Task 3
    println("Task 3:")
    println("Lists: ")
    val list1 : List[Int] = List(99, 10, 5, 5, 7, 10, 1)
    val list2 : List[Double] = List(10, 30.0, 50, 4, 5)
    println("List 1: " + list1)
    println("List 2: " + list2)
    println(" ")

    // Join lists
    val joinedList = list1 ::: list2
    println("Joined List:")
    println(joinedList)
    println(" ")

    // Find first element in joined list
    println("First element: " + joinedList.head)

    // Find middle element in the joined list
    val index = joinedList.length / 2
    println("Middle element: " + joinedList(index))

    // Find the last element in joined list
    printf("Last element: %.0f\n", joinedList.last)
    println(" ")

    // Task 4
    println("Task 4:")

    // Create course class
    case class Course(name : String, price : Double)
    {
      implicit def courseID(course: Course) : Int = {
        course.name.hashCode()
      }
    }

    // Create course objects
    val course1 = Course("ICE362S Elective, FT", 40000)
    val course2 = Course("ICE262S Elective, FT", 35000)
    val course3 = Course("ICF152S Elective, FT", 30000)

    // Print Course Inventory
    printf("%s , Course Price: R %.0f, CourseID: %d\n", course1.name, course1.price, course1.courseID(course1))
    printf("%s , Course Price: R %.0f, CourseID: %d\n", course2.name, course2.price, course2.courseID(course2))
    printf("%s , Course Price: R %.0f, CourseID: %d\n", course3.name, course3.price, course3.courseID(course3))

  }
}
