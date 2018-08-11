package es.david.kyu7

object LoveVsFriendship {
  def loveVsFriendship(s: String): Int = {

    val arrayLetras: Array[String] = s.split("")

    val arrayByes: Array[Byte] = arrayLetras.flatMap(x => (x.getBytes))
    val arrayNum: Array[Int] = arrayByes.map(_.intValue - 96)

    arrayNum.reduce(_ + _)
  }
}
