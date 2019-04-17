package es.david.kyu7

// https://www.codewars.com/kata/exes-and-ohs/train/scala

object ExesAndOhs {
  def xo(str: String): Boolean = {
    val array: Array[Char] = str.toCharArray
    val nXs = array.count(x => x.equals('x') || x.equals('X'))
    val nOs = array.count(x => x.equals('o') || x.equals('O'))
    nOs == nXs
  }
}

/*
def xo(str: String): Boolean =
    str.toLowerCase match { case s => s.count(_ == 'x') == s.count(_ == 'o') }
}
 */