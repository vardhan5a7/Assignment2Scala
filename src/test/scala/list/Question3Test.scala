package list

import org.scalatest.funsuite.AnyFunSuite

class Question3Test extends AnyFunSuite{

  val question3 = new Question3

  test(testName = "Count given list without using any pre defind functions ") {

    assert(question3.countGivenList(List(1,2,3,4,5,6,7,8,9,10)) == 10)
    assert(question3.countGivenList(List(1,1,1,1,1,1,1)) == 7)
    assert(question3.countGivenList(List()) == 0)
  }
}
