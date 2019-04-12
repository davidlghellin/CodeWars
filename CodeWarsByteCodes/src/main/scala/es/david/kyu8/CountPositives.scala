package es.david.kyu8

//https://www.codewars.com/kata/count-of-positives-slash-sum-of-negatives/train/scala

object CountPositives {
  def countPositivesSumNegatives(integers: Array[Int]): (Int, Int) = {
    //    (integers.filter(_ > 0).sum, integers.filter(_ < 0).sum)
    integers match {
      case _ if (integers.isEmpty) => (0, 0)
      case _ => (integers.filter(_ > 0).size, integers.filter(_ < 0).sum)
    }
  }
}
