package es.david.kyu7

// https://www.codewars.com/kata/sum-of-two-lowest-positive-integers/train/scala
object LowIntSum {
  def sumTwoSmallest(numbers: List[Int]): Int = {
    val menor: Int = numbers.min
    val segundoMenor:Int = numbers.filter(x=> x != menor).min
    menor + segundoMenor
  }
}
//numbers.sorted.take(2).sum