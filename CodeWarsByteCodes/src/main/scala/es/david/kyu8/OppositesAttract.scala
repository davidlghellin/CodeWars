package es.david.kyu8

//https://www.codewars.com/kata/opposites-attract/train/scala

object OppositesAttract {
  def lovefunc(flower1: Int, flower2: Int): Boolean = {
    comparar(flower1, flower2) || comparar(flower2, flower1)
  }

  def comparar(a: Int, b: Int): Boolean = {
    a % 2 == 0 && b % 2 == 1
  }
}
