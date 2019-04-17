package es.david.kyu7

//https://www.codewars.com/kata/hungarian-vowel-harmony-easy/train/scala

object HungarianVowelHarmony {
  def dative(word: String): String = {
    // Implement me! :)
    val nek = List('e', 'é', 'i', 'í', 'ö', 'ő', 'ü', 'ű')
    val wordReplace: String = word.replaceAll("[^aáoóuúeéiíöőüű]", "")
    val caracter: Char = wordReplace.reverse.charAt(0)
    caracter match {
      case x: Char if (nek.contains(x)) => word.concat("nek")
      case _ => word.concat("nak")
    }
  }
}

/*
 def dative(word: String): String =
    s"""$word${if ("eéiíöőüű".contains(word.filter("eéiíöőüűaáoóuú".toSet.contains).last)) "nek" else "nak"}"""
 */