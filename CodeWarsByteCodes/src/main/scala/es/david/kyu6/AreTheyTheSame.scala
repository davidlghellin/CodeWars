// https://www.codewars.com/kata/are-they-the-same/train/scala
package es.david.kyu6

object AreTheyTheSame {
  def comp(seq1: Seq[Int], seq2: Seq[Int]): Boolean = (seq1, seq2) match {
    case (null, null) => false
    case (_, null) => false
    case (null, _) => false
    case (_, _) => {
      val sort1 = seq1.sorted
      val sort2 = seq2.sorted

      val juntos = sort1.zip(sort2).filter(x => x._1 != Math.sqrt(x._2)).size
      juntos == 0
    }
  }

  //case _ => seq1.map(n => n*n).sorted.equals(seq2.sorted)

  //if (seq1 == null || seq2 == null) false else seq1.map(x => x * x).sorted == seq2.sorted

  /*
    def comp(seq1: Seq[Int], seq2: Seq[Int]) = (Option(seq1), Option(seq2)) match {
    case (Some(_), Some(_)) => seq1.map(Math.pow(_, 2)).sorted == seq2.sorted
    case _ => false
  }
   */
}
