package es.david.kyu6

object Multiples_3_Or_5 {
  def solution(number: Int): Long = {
    val array = 1L to (number - 1)
    val salida: Long = array.filter(x => x % 3L == 0L || x % 5L == 0L).sum
    salida
  }

  //  (1 until number).view.filter(x => x % 3 == 0 || x % 5 == 0).foldLeft(0L)(_ + _)
}
