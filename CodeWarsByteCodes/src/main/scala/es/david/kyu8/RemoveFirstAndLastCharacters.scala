package es.david.kyu8

object RemoveFirstAndLastCharacters {

  // https://www.codewars.com/kata/remove-first-and-last-character/train/scala

  def removeChars(s: String): String = {
    s.substring(1, s.length()-1)
  }

}
