package es.david.kyu7

import org.scalatest.FlatSpec

class PokerHandTest extends FlatSpec {
  it should "work with example tests" in {
    assert(PokerHand.isFlush(List("AS", "3S", "9S", "KS", "4S")) == true)
    assert(PokerHand.isFlush(List("AD", "4S", "7H", "KC", "5S")) == false)
    assert(PokerHand.isFlush(List("AD", "4S", "10H", "KC", "5S")) == false)
    assert(PokerHand.isFlush(List("QD", "4D", "10D", "KD", "5D")) == true)
  }
}