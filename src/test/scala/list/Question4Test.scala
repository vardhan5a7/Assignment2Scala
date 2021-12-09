package list

import org.scalatest.funsuite.AnyFunSuite

class Question4Test extends  AnyFunSuite{

    val question4 = new Question4

  test(testName = "Replace negative integers to positive integers in given list ") {

    assert(question4.changeNegativeToPositive(List(2, -4, 3, -1, 23, -4, -54)).sameElements(List(2, 4, 3, 1, 23, 4, 54)))

  }
}
