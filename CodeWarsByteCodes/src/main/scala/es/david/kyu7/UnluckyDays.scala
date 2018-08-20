package es.david.kyu7

import java.util.Calendar

object UnluckyDays {
  // https://www.codewars.com/kata/unlucky-days/train/scala

  def unluckyDays(year: Int): Int = {
    val viernes: Int = Calendar.FRIDAY
    val meses: Array[Int] = (0 to 11).toArray

    val unlucky: Int = 13

    import java.util.Calendar

    val cal = Calendar.getInstance
    cal.set(Calendar.YEAR, year)
    cal.set(Calendar.DAY_OF_MONTH, unlucky)
    cal.set(Calendar.MONTH, 7)


    import java.util.Calendar
    if (cal.get(Calendar.DAY_OF_WEEK) eq Calendar.SUNDAY)
      System.out.println("Sunday!")

    return 0
  }
}
