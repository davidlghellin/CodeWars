package es.david.kyu7

object Bus {
  /*
  Cuenta los que suben y bajan del bus, queremos saber los que quedan en el bus al final
   */
  def number(busStops: List[(Int, Int)]): Int = {
    val inOut: List[Int] = busStops.map { case (x, y) => x - y }
    inOut.reduce(_ + _)
  }
}