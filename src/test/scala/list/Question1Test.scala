package list

import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.ListBuffer

class Question1Test extends AnyFunSuite{

  val question1 = new Question1

  test(testName = "check the given array repeat the n times based on ntimes value ") {

    //Expected Output for array
    val expectedList =  List(1,1,1,2,2,2,3,3,3,4,4,4)
    val list: ListBuffer[Int] = question1.reapetIndexValueNTimes(List(1,2,3,4), 3)
    var check = false

    //validate the Actual array equal to Expected array
    if(list.length == expectedList.length)
      for(i <- 0 to list.length - 1)
        if(list(i) == expectedList(i))
          check = true
        else
          check = false

    //Validate by using for loop O(n) time complex
    assert(check == true)
    //or Using sameElements pre defined function to validate
    assert(question1.reapetIndexValueNTimes(List(1,2,3,4), 3).sameElements(expectedList))
  }
}
