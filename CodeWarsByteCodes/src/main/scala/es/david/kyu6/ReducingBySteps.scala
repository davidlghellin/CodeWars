package es.david.kyu6

//https://www.codewars.com/kata/reducing-by-steps/train/scala

object ReducingBySteps {
  def gcdi(a: Long, b: Long): Long = if (b == 0) a.abs else gcdi(b, a % b)

  def lcmu(a: Long, b: Long): Long = (a * b).abs / gcdi(a, b)


  def som(a: Long, b: Long): Long = a + b // your code
  def maxi(a: Long, b: Long): Long = Math.max(a, b) // your code
  def mini(a: Long, b: Long): Long = Math.min(a, b) // your code
  def operArray(f: (Long, Long) => Long, arr: List[Long], init: Long): List[Long] = {
    var aux: Long = init
    arr.map(x => {
      val auxMap: Long = f(aux, x)
      aux = auxMap
      aux
    })
  }
}

/*
 def operArray(f: (Long, Long) => Long, arr: List[Long], init: Long): List[Long] = arr match {
    case List(x) => List(f(x, init))
    case x :: xs =>
      val res = f(x, init)
      res :: operArray(f, xs, res)
  }
 */