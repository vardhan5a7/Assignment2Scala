package arrays

import org.scalatest.funsuite.AnyFunSuite

class Question3Test extends AnyFunSuite {

  val question3 = new Question3

  test(testName = "Find the maximum difference in given array"){
    assert(question3.findMaximumDifference(Array(8, 3, 1, 7, 9, 5, 11, 3, 5)) == 10)
    assert(question3.findMaximumDifference(Array(23,42,5,3,21,7,12,4,78)) == 75)
  }

}
