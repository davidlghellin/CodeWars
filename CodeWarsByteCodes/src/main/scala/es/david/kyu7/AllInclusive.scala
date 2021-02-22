package es.david.kyu7

//https://www.codewars.com/kata/all-inclusive/train/scala
object AllInclusive {
  def containAllRots(strng: String, arr: List[String]): java.lang.Boolean = {
    println ("---")
    println(strng.reverse)
    println(strng)
    println ("---")
    arr.foreach(println )
    arr.contains(strng.reverse)
  }
}
