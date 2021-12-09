package arrays

class Question2 {
  def findMaximumProducts(arr: Array[Int]): Int = {

    /*
    Using insertion sort for sorting to given array
    Time Complexity O(n^2)
     */
    for(i <- 1 to arr.length - 1) {
      var j = i - 1
      var key = arr(i)
      while (j >= 0 && arr(j) > key) {
        arr(j + 1) = arr(j)
        j -= 1
      }
      arr(j + 1) = key
    }

    val maxProducts1 = arr(arr.length - 1) * arr(arr.length - 2)
    val maxProducts2 = arr(0) * arr(1)

    if(maxProducts1 > maxProducts2)
      maxProducts1
    else
      maxProducts2

  }

  println(findMaximumProducts(Array(2, 3, 5, 7, -7, 5, 8, -5)))
  println(findMaximumProducts(Array(23,42,5,3,21,7,12,-4,-78)))
}
