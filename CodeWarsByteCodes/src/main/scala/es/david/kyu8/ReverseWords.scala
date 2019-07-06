package es.david.kyu8

object ReverseWords {
  def reverseWords(str: String): String = {
    str.split(" ").reverse.mkString(" ")
  }
}
