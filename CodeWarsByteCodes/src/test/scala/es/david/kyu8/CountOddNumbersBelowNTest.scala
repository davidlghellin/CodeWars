package es.david.kyu8

import org.scalatest.{FlatSpec, Matchers}

class CountOddNumbersBelowNTest extends FlatSpec with Matchers {

  "oddCount(15)" should "return 7" in {
    CountOddNumbersBelowN.oddCount(15) should be (7)
  }

  "oddCount(15023)" should "return 7511" in {
    CountOddNumbersBelowN.oddCount(15023) should be (7511)
  }
}