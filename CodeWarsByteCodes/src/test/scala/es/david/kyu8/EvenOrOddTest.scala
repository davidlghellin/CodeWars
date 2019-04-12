package es.david.kyu8

import org.scalatest.{FlatSpec, Matchers}

class EvenOrOddTest extends FlatSpec with Matchers {
  val tests = List(
    (2, "Even"),
    (0, "Even"),
    (7, "Odd"),
    (1, "Odd"),
    (-8009,"Odd")
  )
  tests.foreach {
    case (input, expected) =>
      s"evenOrOdd($input)" should s"return $expected" in {
        EvenOrOdd.evenOrOdd(input) should be(expected)
      }
  }
}