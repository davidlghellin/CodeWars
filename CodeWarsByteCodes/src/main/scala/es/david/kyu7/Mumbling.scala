package es.david.kyu7

//https://www.codewars.com/kata/mumbling/train/scala

object Mumbling {
  def accum(s: String) = {
    val caracteres: List[String] = s.split("").toList
    val index: List[(String, Int)] = caracteres.zipWithIndex

    val aux: List[(String, Int)] = index.map(x => (x._1.toUpperCase + x._1.toLowerCase * x._2, x._2))
    val listaString: List[String] = aux.map(x => x._1).toList
    listaString.reduce(_ + "-" + _)
  }
}
