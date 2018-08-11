package es.david.kyu8

object SmallestIntegerFinder {

  def findSmallestInt(nums: List[Int]): Int = nums.reduceLeft((x, y) => if (x < y) x else y)
  // nums.reduceLeft(math.min)
  // nums reduce math.min
  // nums.sorted.apply(0)
}
