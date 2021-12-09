package arrays

class Question3 {

  def findMaximumDifference(arr: Array[Int]): Int = {

    var max = arr(0)
    var min = arr(arr.length - 1)
    /*
    find maximum value
    Time complexity O(n)
     */
    for(i <- 0 to arr.length - 1)
      if(min > arr(i))
        min = arr(i)
    /*
    find minimum value
    Time complexity O(n)
     */
    for(i <- 0 to arr.length - 1)
      if(max < arr(i))
        max = arr(i)

    val findDifference  = max - min

    findDifference
  }
  println(findMaximumDifference(Array(8, 3, 1, 7, 9, 5, 11, 3, 5)))
  println(findMaximumDifference(Array(23, 42, 5, 3, 21, 7,1 ,2, 4,7, 8)))
}
