package es.david.kyu7

//https://www.codewars.com/kata/determine-if-the-poker-hand-is-flush/train/scala

object PokerHand {
  def isFlush(cards: List[String]): Boolean = {
    val palosMano: List[String] = cards.map(x => x.substring(x.size-1, x.size))
    val palo1: String = palosMano(0)
    val nPalosEnMano = palosMano.filter(x => x == palo1).size
    nPalosEnMano == 5
  }
}
//cards.map(_.last).toSet.size == 1

//def isFlush(cards: List[String]): Boolean = {
//  val suit = cards.head.last
//  cards.forall(_.last == suit)
//}