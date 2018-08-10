package es.david.kyu8

import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.scalatest.{FlatSpec, FunSuite, Matchers}


class ReversedStringsTest extends FlatSpec with Matchers {

  "ReversedStrings.solution" should "pass fixed tests" in {
    ReversedStrings.solution("dlrow") should equal("world")
  }

}
