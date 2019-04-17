package es.david.kyu8

// https://www.codewars.com/kata/pillars/train/scala

object Pillars {
  def distance(num_pill: Int, dist: Int, width: Int): Int = {
    num_pill match {
      case x: Int if (x > 1) => (num_pill - 1) * dist * 100 + (num_pill - 2) * width
      case _ => 0
    }
  }
}
