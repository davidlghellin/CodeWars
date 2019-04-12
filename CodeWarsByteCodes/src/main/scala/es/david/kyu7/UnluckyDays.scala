package es.david.kyu7

import java.util.Calendar

object UnluckyDays {
  // https://www.codewars.com/kata/unlucky-days/train/scala

  def unluckyDays(year: Int): Int = {
    val viernes: Int = Calendar.FRIDAY
    val meses: Array[Int] = (0 to 11).toArray

    val unlucky: Int = 13


    val nMeses13: Array[Boolean] = meses.map(x => comprobarViernes13(setCalendar(year, x)))
    nMeses13.count(x => x)

  }

  def setCalendar(year: Int, mes: Int): Calendar = {
    val cal = Calendar.getInstance
    cal.set(Calendar.YEAR, year)
    cal.set(Calendar.DAY_OF_MONTH, 13)
    cal.set(Calendar.MONTH, mes)
    cal
  }

  def comprobarViernes13(calendar: Calendar): Boolean = {
    if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
      true
    else
      false
  }
}
