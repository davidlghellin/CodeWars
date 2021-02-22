package es.david.kyu7

import org.scalatest._
import org.scalatest.Assertions._


class RotationsTestT extends FlatSpec with Matchers {

  it should "pass basic tests" in {
    val a = List("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
    AllInclusive.containAllRots("bsjq", a) shouldBe true
  }

  it should "pass basic tests 2" in {
    val a = List("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
    AllInclusive.containAllRots("XjYABhR", a) shouldBe false

  }

  it should "pass basic tests 3" in {
    val a = List("hQmSQJA", "QJAhQmS", "QmSQJAh", "yUgUXoQE", "AhQmSQJ", "mSQJAhQ", "SQJAhQm", "JAhQmSQ")
    AllInclusive.containAllRots("QJAhQmS", a) shouldBe true
  }

  it should "pass basic tests 4" in {
    val a = List("nVOETcaxdvuk", "shpEts", "hpEtss", "Etsshp", "OuIiQ", "sXrDdPXIaW", "tsshpE", "pEtssh")
    AllInclusive.containAllRots("Etsshp", a) shouldBe false

  }
}
