package list
import scala.collection.mutable.ListBuffer

class Question4 {
  def changeNegativeToPositive(list: List[Int]): ListBuffer[Int] = {


    val listOfElements = new ListBuffer[Int]

    //remove even index values by using below given condition O(n)
    for(i <- 0 to list.length - 1)
      if(list(i) < 0)
        listOfElements += -list(i)
      else
        listOfElements += list(i)

    listOfElements
  }
  println(changeNegativeToPositive(List(2, -4, 3, -1, 23, -4, -54)).mkString(","))

}
