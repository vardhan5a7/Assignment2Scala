package arrays

import org.scalatest.funsuite.AnyFunSuite

class Question2Test extends AnyFunSuite{

  val question2 = new Question2

  test(testName = "Find the maximum products in given array"){
    assert(question2.findMaximumProducts(Array(2, 3, 5, 7, -7, 5, 8, -5)) == 56)
    assert(question2.findMaximumProducts(Array(23,42,5,3,21,7,12,-4,-78)) == 966)
  }
}
