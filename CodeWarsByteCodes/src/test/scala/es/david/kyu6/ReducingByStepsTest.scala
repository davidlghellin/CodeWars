package es.david.kyu6

import org.scalatest.{FlatSpec, Matchers}

class ReducingByStepsTest extends FlatSpec with Matchers {

  "gcdi" should "max comun denominador" in {
    val a: List[Long] = List(18, 69, -90, -78, 65, 40)
    val r: List[Long] = List(18, 3, 3, 3, 1, 1)

    val act = ReducingBySteps.operArray(ReducingBySteps.gcdi, a, a(0))
    act shouldBe r
  }

  "lcmu" should "minimo comun multiplo" in {
    val a: List[Long] = List(18, 69, -90, -78, 65, 40)
    val r: List[Long] = List(18, 414, 2070, 26910, 26910, 107640)

    val act = ReducingBySteps.operArray(ReducingBySteps.lcmu, a, a(0))
    act shouldBe r
  }

  "som" should "" in {
    val a: List[Long] = List(18, 69, -90, -78, 65, 40)
    val r: List[Long] = List(18, 87, -3, -81, -16, 24)

    val act = ReducingBySteps.operArray(ReducingBySteps.som, a, 0)
    act shouldBe r
  }
  "mini" should "" in {
    val a: List[Long] = List(18, 69, -90, -78, 65, 40)
    val r: List[Long] = List(18, 18, -90, -90, -90, -90)

    val act = ReducingBySteps.operArray(ReducingBySteps.mini, a, a(0))
    act shouldBe r
  }

  "maxi" should "pass basic tests" in {
    val a: List[Long] = List(18, 69, -90, -78, 65, 40)
    val r: List[Long] = List(18, 69, 69, 69, 69, 69)

    val act = ReducingBySteps.operArray(ReducingBySteps.maxi, a, a(0))
    act shouldBe r
  }
}