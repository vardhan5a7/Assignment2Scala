package list

import scala.collection.mutable.ListBuffer

class Question2 {
  def removeEvenIndexValue(list: List[Int]): ListBuffer[Int] = {

    val lengthOfArray = list.length / 2
    val listOfElements = new ListBuffer[Int]

    //remove even index values by using below given condition
    //time complex O(n)
    for(i <- 1 to list.length - 1)
      if(i % 2 != 0)
      {
        listOfElements  += list(i)
      }

    listOfElements
  }
  println(removeEvenIndexValue(List(1,2,3,4,5,6,7,8)).mkString(""))
  println(removeEvenIndexValue(List(1,7,4,4,5,1,8,99)).mkString(""))
}
