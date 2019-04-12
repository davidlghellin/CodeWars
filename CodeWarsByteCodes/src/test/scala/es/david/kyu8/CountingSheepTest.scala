package es.david.kyu8

import org.scalatest.{FlatSpec, Matchers}

class CountingSheepTest extends FlatSpec with Matchers {

  val sheep = Array(
    true, true, true, false,
    true, true, true, true,
    true, false, true, false,
    true, false, false, true,
    true, true, true, true,
    false, false, true, true
  )
  val sheepCount = 17

  s"countSheep(${sheep.mkString(", ")})" should s"return $sheepCount" in {
    CountingSheep.countSheep(sheep) should be(sheepCount)
  }
}