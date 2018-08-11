package es.david.kyu8

object CenturyFromYear {
  def centuryFromYear(year: Int): Int = {
    val cent = year / 100
    val modulo = year % 10

    (cent, modulo) match {
      case (c, _) if c == 0  => cent
      case (c, m) if c != 0 && m == 0 => cent
      case _ => cent + 1
    }
  }
}
