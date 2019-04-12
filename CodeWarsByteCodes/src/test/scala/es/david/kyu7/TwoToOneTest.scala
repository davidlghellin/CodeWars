package es.david.kyu7

import org.scalatest.{FlatSpec, Matchers}

class TwoToOneTest extends FlatSpec with Matchers {

  val tests = List(
    (("aretheyhere", "yestheyarehere"), "aehrsty"),
    (("loopingisfunbutdangerous", "lessdangerousthancoding"), "abcdefghilnoprstu"),
    (("inmanylanguages", "theresapairoffunctions"), "acefghilmnoprstuy")
  )

  tests.foreach {
    case ((s1, s2), expected) =>
      s"longest($s1, $s2)" should s"return $expected" in {
        TwoToOne.longest(s1, s2) should be (expected)
      }
  }
}