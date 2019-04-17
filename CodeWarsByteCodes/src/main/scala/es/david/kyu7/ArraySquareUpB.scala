package es.david.kyu7

// https://www.codewars.com/kata/array-squareup-b/train/scala

object ArraySquareUpB {

  def squareUp(n: Int) = {
    val lista = (1 to n).toList
    val listaListas = lista.map(calcListReverse(_))
    listaListas.map(addZeros(n, _)).flatten
  }

  def calcListReverse(n: Int): List[Int] = {
    (1 to n).toList.reverse
  }

  def addZeros(n: Int, lista: List[Int]): List[Int] = {
    val tamanyo: Int = lista.size
    val addnZeros = List.fill(n - tamanyo)(0)
    addnZeros ::: lista
  }
}

//def squareUp(n: Int): List[Int] =(1 to n).flatMap(i => (1 to i).padTo(n, 0).reverse).toList