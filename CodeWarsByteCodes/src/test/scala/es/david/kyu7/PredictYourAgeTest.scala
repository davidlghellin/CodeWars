package es.david.kyu7

import org.scalatest.{FlatSpec, FunSuite, Matchers}

class PredictYourAgeTest extends FlatSpec with Matchers {

  "predictAge(65,60,75,55,60,63,64,45)" should "return 86" in {
    PredictYourAge.predictAge(65, 60, 75, 55, 60, 63, 64, 45) should be(86)
  }

  "predictAge(32,54,76,65,34,63,64,45)" should "return 79" in {
    PredictYourAge.predictAge(32, 54, 76, 65, 34, 63, 64, 45) should be(79)
  }
}
