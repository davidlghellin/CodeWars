package es.david.kyu7

// https://www.codewars.com/kata/get-the-middle-character/train/scala

object GetTheMiddleCharacter {
  def middle(s: String): String = {
    s match {
      case s: String if (s.size <= 2) => s
      case x => {
        val n = s.size
        n match {
          case n: Int if (n % 2 == 0) => s.substring(n / 2 - 1, n / 2 + 1)
          case x => s.substring(n / 2, n / 2 + 1)
        }
      }
    }
  }
}
//def middle(s: String): String = s.substring(s.length/2-1+s.length%2,s.length/2+1)