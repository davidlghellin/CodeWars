package es.david.kyu7

//https://www.codewars.com/kata/maximum-length-difference/train/scala

object MaximumLengthDifference {
  def mxdiflg(a1: List[String], a2: List[String]): Int = {
    val aux = for {
      a <- a1
      b <- a2} yield (Math.abs((a.size - b.size)))

    a1 match {
      case x if (a1.isEmpty || a2.isEmpty) => -1
      case _ => aux.max
    }
  }
}
