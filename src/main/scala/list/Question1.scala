package list

import scala.collection.mutable.ListBuffer

class Question1 {
  def reapetIndexValueNTimes(list: List[Int], n: Int): ListBuffer[Int] = {

    val len = list.size * n
    val listOfElements = new ListBuffer[Int]()

    //no.of iteration based on size of the array and value
    //Time complex O(n^2)
    for(i <- 0 to list.length - 1)
      for(j <- 1 to n)
      {
        listOfElements += list(i)
        println(list(i))
      }
    listOfElements
  }
  println(reapetIndexValueNTimes(List(1, 2, 3, 4), 3).mkString(","))
}

