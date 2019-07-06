package es.david.kyu8

import org.scalatest.{FlatSpec, Matchers}

class ReverseWordsTest extends FlatSpec with Matchers {
  "Reverse words" should "pass basic tests" in {
    assert(ReverseWords.reverseWords("hello world!") === "world! hello")
  }

}
