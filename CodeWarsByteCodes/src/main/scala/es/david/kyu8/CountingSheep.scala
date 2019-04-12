package es.david.kyu8

//https://www.codewars.com/kata/counting-sheep-dot-dot-dot/train/scala

object CountingSheep {
  def countSheep(sheep: Array[Boolean]): Int = {
    sheep.count(_ == true)
  }
}
