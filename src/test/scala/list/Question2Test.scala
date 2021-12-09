package list

import org.scalatest.funsuite.AnyFunSuite

class Question2Test extends AnyFunSuite{
  val question2 = new Question2

  test(testName = "Display only odd index values in given list"){

    assert(question2.removeEvenIndexValue(List(1,2,3,4,5,6,7,8)).sameElements(List(2,4,6,8)))
    assert(question2.removeEvenIndexValue((List(1,7,4,4,5,1,8,99))).sameElements(List(7,4,1,99)))

  }
}
