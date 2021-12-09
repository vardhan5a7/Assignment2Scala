package arrays

import org.scalatest.funsuite.AnyFunSuite

class Question1Test extends  AnyFunSuite{

  val question1 = new Question1

  test(testName = "find the next greatest element and reaplace max value"){
    assert(question1.findNextGreatestElement(Array(9, 5, 8, 4, -10, 21, 6, 17, 11)).sameElements(Array(21,21,21,21,21,-1,17,-1,-1)))
    assert(question1.findNextGreatestElement(Array(3,7,4,8,2,1)).sameElements((Array(8,8,8,-1,-1,-1))))
  }
}
