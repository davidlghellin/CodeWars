package es.david.kyu7

object LoveVsFriendship {
  def loveVsFriendship(s: String): Int = {

    val arrayLetras: Array[String] = s.split("")

    val arrayByes: Array[Byte] = arrayLetras.flatMap(x => (x.getBytes))
    val arrayNum: Array[Int] = arrayByes.map(_.intValue - 96)

    arrayNum.reduce(_ + _)
  }

  //def loveVsFriendship(s: String): Int = s.toCharArray.map(c => c.toInt - 96).sum
  //def loveVsFriendship(s: String) = s.map(_ - 'a' + 1).sum
}
