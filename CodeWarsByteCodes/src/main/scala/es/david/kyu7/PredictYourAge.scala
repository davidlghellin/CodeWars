package es.david.kyu7

object PredictYourAge {
  def predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int = {
    val l: List[Int] = age1 :: age2 :: age3 :: age4 :: age5 :: age6 :: age7 :: age8 :: Nil
    val s = l.map(x => x * x).sum
    (Math.sqrt(s) / 2).toInt
  }

  def predictAgeArray(ages: Int*): Int = {
    Math.sqrt(ages.map(a => a * a).sum).toInt / 2
  }
}
