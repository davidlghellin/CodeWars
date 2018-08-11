package es.david.kyu7

import org.scalatest.{FlatSpec, Matchers}

class LoveVsFriendshipTest extends FlatSpec with Matchers {

  "attitude" should " be 100" in {
    LoveVsFriendship.loveVsFriendship("attitude") shouldBe 100
  }

  "friends" should " be 75" in {
    LoveVsFriendship.loveVsFriendship("friends") shouldBe 75
  }

  "family" should " be 66" in {
    LoveVsFriendship.loveVsFriendship("family") shouldBe 66
  }

  "selfness" should " be 99" in {
    LoveVsFriendship.loveVsFriendship("selfness") shouldBe 99
  }

  "knowledge" should " be 96" in {
    LoveVsFriendship.loveVsFriendship("knowledge") shouldBe 96
  }
}
