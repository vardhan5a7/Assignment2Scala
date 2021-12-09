package arrays

class Question3 {

  def findMaximumDifference(arr: Array[Int]): Int = {

    var maxValue = 0
    /*
    find maximum value
    Time complexity O(n^2)
     */
    for(i <- 0 to arr.length - 1)
      for(j <- i + 1  to arr.length - 1)
        if(i < j && arr(i) < arr(j) && Math.abs(arr(i) - arr(j)) > maxValue)
          maxValue = Math.abs(arr(i) - arr(j))

    maxValue
  }
  println(findMaximumDifference(Array(8, 3, 1, 7, 9, 5, 11, 3, 5)))
  println(findMaximumDifference(Array(23,42,5,3,21,7,12,4,78)))
}
