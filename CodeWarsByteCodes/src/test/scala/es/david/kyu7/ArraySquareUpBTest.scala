package es.david.kyu7

import org.scalatest.{FlatSpec, FunSuite, Matchers}

class ArraySquareUpBTest extends FunSuite {
  test("Example Tests") {
    assert(ArraySquareUpB.squareUp(2) == List(0, 1, 2, 1))
    assert(ArraySquareUpB.squareUp(3) == List(0, 0, 1, 0, 2, 1, 3, 2, 1))
    assert(ArraySquareUpB.squareUp(4) == List(0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1))
  }
}
