package es.david.kyu8

import org.scalatest.{FlatSpec, FunSuite, Matchers}

class CenturyFromYearTest extends FlatSpec with Matchers {

  "centuryFromYear(0)" should "return 0" in {
    CenturyFromYear.centuryFromYear(0) should be(0)
  }

  "centuryFromYear(2)" should "return 0" in {
    CenturyFromYear.centuryFromYear(2) should be(0)
  }

  "centuryFromYear(99)" should "return 0" in {
    CenturyFromYear.centuryFromYear(99) should be(0)
  }

  "centuryFromYear(100)" should "return 1" in {
    CenturyFromYear.centuryFromYear(100) should be(1)
  }

  "centuryFromYear(1705)" should "return 18" in {
    CenturyFromYear.centuryFromYear(1705) should be(18)
  }

  "centuryFromYear(1900)" should "return 19" in {
    CenturyFromYear.centuryFromYear(1900) should be(19)
  }

  "centuryFromYear(1601)" should "return 17" in {
    CenturyFromYear.centuryFromYear(1601) should be(17)
  }

  "centuryFromYear(2000)" should "return 20" in {
    CenturyFromYear.centuryFromYear(2000) should be(20)
  }
}