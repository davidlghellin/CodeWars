package es.david.kyu7

//https://www.codewars.com/kata/shortest-word/train/scala

object ShortestWord {
  def findShort(str: String): Int = {
    val palabras: List[String] = str.split(" ").toList
    palabras.map(_.size).min
  }
}

//def findShort(string: String): Int = string split " "  map { word => word.length } min