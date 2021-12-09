package arrays

class Question1 {

  def findNextGreatestElement(arr: Array[Int]): Array[Int] = {
    var currentMax = 0
    var arr1 = new Array[Int](arr.length)

    for(i <- arr.length - 1 to 0 by -1) {
      if(currentMax < arr(i)) {
        currentMax = arr(i)
        arr1(i) = -1
      }
      else{
        arr1(i) = currentMax
      }
    }
    arr1
  }
  println(findNextGreatestElement(Array(9, 5, 8, 4, -10, 21, 6, 17, 11)).mkString(","))
  println(findNextGreatestElement(Array(3,7,4,8,2,1)).mkString(","))
}
