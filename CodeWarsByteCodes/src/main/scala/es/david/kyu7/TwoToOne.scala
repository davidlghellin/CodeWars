package es.david.kyu7

object TwoToOne {
  def longest(s1: String, s2: String): String = {
    val cadena: String = s1.concat(s2)
    val letrasRepes: Array[Char] = cadena.toCharArray
    val letrasOrdenadas: Array[Char] = letrasRepes.sortWith(_ < _)

    letrasOrdenadas.distinct.mkString("")
  }
}
//  def longest(s1: String, s2: String): String = (s1 + s2).distinct.sorted