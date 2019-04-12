package es.david.kyu8

//https://www.codewars.com/kata/even-or-odd/train/scala

object EvenOrOdd {
  def evenOrOdd(number: Int): String = {
    // your code here
    val aux = Math.abs(number)
    aux match {
      case aux if (aux % 2 == 0) => "Even"
      case aux if (aux % 2 == 1) => "Odd"
    }
  }
}
