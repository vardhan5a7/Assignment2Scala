package list

class Question3 {
  def countGivenList(list: List[Int]): Int = {
    var count  = 0
    //Time complexity o(n)
    for(i <-  list)
      count += 1

    count
  }
  println(countGivenList(List(1,2,3,4,5,6,7,8,9,10)))
  println(countGivenList(List(1,1,1,1,1,1,1)))
  println(countGivenList(List()))
}
