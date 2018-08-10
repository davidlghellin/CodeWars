package es.david.kyu8

/**
  * Your task is very simple. Just write a function isAlphabetic(s), which takes an input string s in lowercase and returns true/false depending on whether the string is in alphabetical order or not.
  *
  * For example, isAlphabetic('kata') is False as 'a' comes after 'k', but isAlphabetic('ant') is True.
  *
  * Good luck :)
  */
object isAlphabetic extends App {

  def isAlphabetic(s: String): Boolean = {

    def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
      @annotation.tailrec
      def loop(n: Int, acc: Boolean): Boolean = {
        if ((n + 1) >= as.length)
          acc
        else
          loop(n + 1, acc && ordered(as(n), as(n + 1)))
      }

      loop(0, true)
    }

    isSorted(s.getBytes, (x: Byte, y: Byte) => x <= y)

  }

}
